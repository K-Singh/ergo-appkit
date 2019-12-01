package org.ergoplatform.appkit;

import org.ergoplatform.ErgoAddress;
import org.ergoplatform.ErgoAddressEncoder;
import org.ergoplatform.P2PKAddress;
import scala.util.Try;
import scorex.util.encode.Base58;
import sigmastate.basics.DLogProtocol;
import sigmastate.utils.Helpers;
import static com.google.common.base.Preconditions.checkArgument;

public class Address {
    private final String _base58String;
    private final byte[] _addrBytes;
    ErgoAddress _address;

    /**
     * First byte is used to encode network type and address type.
     *
     * @see ErgoAddressEncoder
     */
    private byte headByte() { return _addrBytes[0]; }

    private Address(String base58String) {
        _base58String = base58String;
        Try<byte[]> res = Base58.decode(base58String);
        if (res.isFailure())
            throw new RuntimeException(
                    "Invalid address encoding, expected base58 string: " + base58String,
                    (Throwable)new Helpers.TryOps(res).toEither().left().get());
        _addrBytes = res.get();
        ErgoAddressEncoder encoder = ErgoAddressEncoder.apply(getNetworkType().networkPrefix);
        Try<ErgoAddress> addrTry = encoder.fromString(base58String);
        if (addrTry.isFailure())
            throw new RuntimeException(
                    "Invalid address encoding, expected base58 string: " + base58String,
                    (Throwable)new Helpers.TryOps(addrTry).toEither().left().get());
        _address = addrTry.get();
    }

    /**
     * @return NetworkType of this address.
     */
    public NetworkType getNetworkType() { return isMainnet() ? NetworkType.MAINNET : NetworkType.TESTNET; }

    /**
     * @return true if this address from Ergo mainnet.
     */
    public boolean isMainnet() { return headByte() < NetworkType.MAINNET.networkPrefix; }

    /**
     * @return true if this address has Pay-To-Public-Key type.
     */
    public boolean isP2PK() { return _address instanceof P2PKAddress; }

    /**
     * Extract public key from P2PKAddress.
     */
    public DLogProtocol.ProveDlog getPublicKey() {
        checkArgument(isP2PK(), "This instance %s is not P2PKAddress", this);
        return ((P2PKAddress)_address).pubkey();
    }

    /**
     * Create Ergo Address from base58 string.
     *
     * @param base58Str base58 string representation of address bytes.
     * @return Address instance decoded from string
     */
    public static Address create(String base58Str) { return new Address(base58Str); }

    @Override
    public String toString() {
        return _address.toString();
    }
}