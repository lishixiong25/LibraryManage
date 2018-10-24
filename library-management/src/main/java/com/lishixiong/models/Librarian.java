package com.lishixiong.models;

import java.math.BigDecimal;

/**
 * @author com.lishixiong
 * @since 2018/10/24 13:23
 * Singularity Sky Technologies Limited.
 */
public class Librarian extends Person {
  private String name;          //姓名
  private String personNumber;  //工作编号
  private String language;      //语言
  private BigDecimal account;

  @Override
  public String toString() {
    return "Librarian{" +
        "name='" + name + '\'' +
        ", personNumber='" + personNumber + '\'' +
        ", language='" + language + '\'' +
        '}';
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
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
}
