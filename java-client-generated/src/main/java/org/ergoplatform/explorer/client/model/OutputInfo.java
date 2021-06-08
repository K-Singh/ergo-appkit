/*
 * Ergo Explorer API v1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.explorer.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.ergoplatform.explorer.client.model.AdditionalRegisters;
import org.ergoplatform.explorer.client.model.AssetInstanceInfo;
/**
 * OutputInfo
 */


public class OutputInfo {
  @SerializedName("boxId")
  private String boxId = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("blockId")
  private String blockId = null;

  @SerializedName("value")
  private Long value = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("creationHeight")
  private Integer creationHeight = null;

  @SerializedName("settlementHeight")
  private Integer settlementHeight = null;

  @SerializedName("ergoTree")
  private String ergoTree = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("assets")
  private java.util.List<AssetInstanceInfo> assets = null;

  @SerializedName("additionalRegisters")
  private AdditionalRegisters additionalRegisters = null;

  @SerializedName("spentTransactionId")
  private String spentTransactionId = null;

  @SerializedName("mainChain")
  private Boolean mainChain = null;

  public OutputInfo boxId(String boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * Id of the box
   * @return boxId
  **/
  @Schema(required = true, description = "Id of the box")
  public String getBoxId() {
    return boxId;
  }

  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }

  public OutputInfo transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Id of the transaction that created the box
   * @return transactionId
  **/
  @Schema(required = true, description = "Id of the transaction that created the box")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OutputInfo blockId(String blockId) {
    this.blockId = blockId;
    return this;
  }

   /**
   * Id of the block a box included in
   * @return blockId
  **/
  @Schema(required = true, description = "Id of the block a box included in")
  public String getBlockId() {
    return blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public OutputInfo value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the box in nanoERG
   * @return value
  **/
  @Schema(required = true, description = "Value of the box in nanoERG")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public OutputInfo index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Index of the output in a transaction
   * @return index
  **/
  @Schema(required = true, description = "Index of the output in a transaction")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public OutputInfo creationHeight(Integer creationHeight) {
    this.creationHeight = creationHeight;
    return this;
  }

   /**
   * Height at which the box was created
   * @return creationHeight
  **/
  @Schema(required = true, description = "Height at which the box was created")
  public Integer getCreationHeight() {
    return creationHeight;
  }

  public void setCreationHeight(Integer creationHeight) {
    this.creationHeight = creationHeight;
  }

  public OutputInfo settlementHeight(Integer settlementHeight) {
    this.settlementHeight = settlementHeight;
    return this;
  }

   /**
   * Height at which the box got fixed in blockchain
   * @return settlementHeight
  **/
  @Schema(required = true, description = "Height at which the box got fixed in blockchain")
  public Integer getSettlementHeight() {
    return settlementHeight;
  }

  public void setSettlementHeight(Integer settlementHeight) {
    this.settlementHeight = settlementHeight;
  }

  public OutputInfo ergoTree(String ergoTree) {
    this.ergoTree = ergoTree;
    return this;
  }

   /**
   * Serialized ergo tree
   * @return ergoTree
  **/
  @Schema(required = true, description = "Serialized ergo tree")
  public String getErgoTree() {
    return ergoTree;
  }

  public void setErgoTree(String ergoTree) {
    this.ergoTree = ergoTree;
  }

  public OutputInfo address(String address) {
    this.address = address;
    return this;
  }

   /**
   * An address derived from ergo tree
   * @return address
  **/
  @Schema(required = true, description = "An address derived from ergo tree")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OutputInfo assets(java.util.List<AssetInstanceInfo> assets) {
    this.assets = assets;
    return this;
  }

  public OutputInfo addAssetsItem(AssetInstanceInfo assetsItem) {
    if (this.assets == null) {
      this.assets = new java.util.ArrayList<AssetInstanceInfo>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @Schema(description = "")
  public java.util.List<AssetInstanceInfo> getAssets() {
    return assets;
  }

  public void setAssets(java.util.List<AssetInstanceInfo> assets) {
    this.assets = assets;
  }

  public OutputInfo additionalRegisters(AdditionalRegisters additionalRegisters) {
    this.additionalRegisters = additionalRegisters;
    return this;
  }

   /**
   * Get additionalRegisters
   * @return additionalRegisters
  **/
  @Schema(required = true, description = "")
  public AdditionalRegisters getAdditionalRegisters() {
    return additionalRegisters;
  }

  public void setAdditionalRegisters(AdditionalRegisters additionalRegisters) {
    this.additionalRegisters = additionalRegisters;
  }

  public OutputInfo spentTransactionId(String spentTransactionId) {
    this.spentTransactionId = spentTransactionId;
    return this;
  }

   /**
   * Id of the transaction this output was spent by
   * @return spentTransactionId
  **/
  @Schema(description = "Id of the transaction this output was spent by")
  public String getSpentTransactionId() {
    return spentTransactionId;
  }

  public void setSpentTransactionId(String spentTransactionId) {
    this.spentTransactionId = spentTransactionId;
  }

  public OutputInfo mainChain(Boolean mainChain) {
    this.mainChain = mainChain;
    return this;
  }

   /**
   * Get mainChain
   * @return mainChain
  **/
  @Schema(required = true, description = "")
  public Boolean isMainChain() {
    return mainChain;
  }

  public void setMainChain(Boolean mainChain) {
    this.mainChain = mainChain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputInfo outputInfo = (OutputInfo) o;
    return Objects.equals(this.boxId, outputInfo.boxId) &&
        Objects.equals(this.transactionId, outputInfo.transactionId) &&
        Objects.equals(this.blockId, outputInfo.blockId) &&
        Objects.equals(this.value, outputInfo.value) &&
        Objects.equals(this.index, outputInfo.index) &&
        Objects.equals(this.creationHeight, outputInfo.creationHeight) &&
        Objects.equals(this.settlementHeight, outputInfo.settlementHeight) &&
        Objects.equals(this.ergoTree, outputInfo.ergoTree) &&
        Objects.equals(this.address, outputInfo.address) &&
        Objects.equals(this.assets, outputInfo.assets) &&
        Objects.equals(this.additionalRegisters, outputInfo.additionalRegisters) &&
        Objects.equals(this.spentTransactionId, outputInfo.spentTransactionId) &&
        Objects.equals(this.mainChain, outputInfo.mainChain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxId, transactionId, blockId, value, index, creationHeight, settlementHeight, ergoTree, address, assets, additionalRegisters, spentTransactionId, mainChain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputInfo {\n");
    
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    creationHeight: ").append(toIndentedString(creationHeight)).append("\n");
    sb.append("    settlementHeight: ").append(toIndentedString(settlementHeight)).append("\n");
    sb.append("    ergoTree: ").append(toIndentedString(ergoTree)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    additionalRegisters: ").append(toIndentedString(additionalRegisters)).append("\n");
    sb.append("    spentTransactionId: ").append(toIndentedString(spentTransactionId)).append("\n");
    sb.append("    mainChain: ").append(toIndentedString(mainChain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
