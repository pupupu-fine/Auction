package com.example.demo.entity;


public class Item {

  private long itemId;
  private String itemInfo;
  private long finalPrice;
  private String itemLocation;
  private long status;
  private String itemImg1;
  private String itemImg2;
  private String itemImg3;
  private String itemImg4;
  private String telephone;
  private long sellerId;
  private long type;


  public long getItemId() {
    return itemId;
  }

  public void setItemId(long itemId) {
    this.itemId = itemId;
  }


  public String getItemInfo() {
    return itemInfo;
  }

  public void setItemInfo(String itemInfo) {
    this.itemInfo = itemInfo;
  }


  public long getFinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(long finalPrice) {
    this.finalPrice = finalPrice;
  }


  public String getItemLocation() {
    return itemLocation;
  }

  public void setItemLocation(String itemLocation) {
    this.itemLocation = itemLocation;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getItemImg1() {
    return itemImg1;
  }

  public void setItemImg1(String itemImg1) {
    this.itemImg1 = itemImg1;
  }


  public String getItemImg2() {
    return itemImg2;
  }

  public void setItemImg2(String itemImg2) {
    this.itemImg2 = itemImg2;
  }


  public String getItemImg3() {
    return itemImg3;
  }

  public void setItemImg3(String itemImg3) {
    this.itemImg3 = itemImg3;
  }


  public String getItemImg4() {
    return itemImg4;
  }

  public void setItemImg4(String itemImg4) {
    this.itemImg4 = itemImg4;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public long getSellerId() {
    return sellerId;
  }

  public void setSellerId(long sellerId) {
    this.sellerId = sellerId;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Item{" +
            "itemId=" + itemId +
            ", sellerId=" + sellerId +
            ", itemImg1='" + itemImg1 + '\'' +
            ", itemImg2='" + itemImg2 + '\'' +
            ", itemImg3='" + itemImg3 + '\'' +
            ", itemImg4='" + itemImg4 + '\'' +
            ", itemInfo='" + itemInfo + '\'' +
            ", finalPrice=" + finalPrice +
            ", status=" + status +
            ", itemLocation='" + itemLocation + '\'' +
            ", telephoneNumber='" + telephone + '\'' +
            ", type=" + type +
            '}';
  }
}
