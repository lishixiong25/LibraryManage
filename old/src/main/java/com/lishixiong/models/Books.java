package com.lishixiong.models;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author com.lishixiong
 * @since 2018/10/24 13:45
 * Singularity Sky Technologies Limited.
 */
public abstract class Books extends Random {
  private String name;             //书名
  private String size;             //书的大小
  private String type;             //类型
  private String pictureQuality;   //画质
  private String suitable;         //适应年龄
  private String location;         //位置
  private BigDecimal price;        //价格
  private int rate;                //随机出现的几率


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSuitable() {
    return suitable;
  }

  public void setSuitable(String suitable) {
    this.suitable = suitable;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPictureQuality() {
    return pictureQuality;
  }

  public void setPictureQuality(String pictureQuality) {
    this.pictureQuality = pictureQuality;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public abstract int randomTag();
}
