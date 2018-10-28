package com.lishixiong.models;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author com.lishixiong
 * @since 2018/10/24 12:57
 * Singularity Sky Technologies Limited.
 */
public abstract class Person extends Random {
  private String name;        //姓名
  private String hairStyle;   //发型
  private String gender;      //性别
  private int height;         //身高
  private String probabilityAge; //大概年龄
  private String dressed;     //衣着
  private String personNumber;  //工作编号
  private String language;      //语言
  private BigDecimal account;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHairStyle() {
    return hairStyle;
  }

  public void setHairStyle(String hairStyle) {
    this.hairStyle = hairStyle;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getProbabilityAge() {
    return probabilityAge;
  }

  public void setProbabilityAge(String probabilityAge) {
    this.probabilityAge = probabilityAge;
  }

  public String getDressed() {
    return dressed;
  }

  public void setDressed(String dressed) {
    this.dressed = dressed;
  }

  public String getPersonNumber() {
    return personNumber;
  }

  public void setPersonNumber(String personNumber) {
    this.personNumber = personNumber;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public BigDecimal getAccount() {
    return account;
  }

  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  public abstract int randomTag();
}