package com.lishixiong.models;

import java.math.BigDecimal;

/**
 * @author com.lishixiong
 * @since 2018/10/24 13:23
 * Singularity Sky Technologies Limited.
 */
public class Reader  extends Person{
  private BigDecimal alipay;

  public BigDecimal getAlipay() {
    return alipay;
  }

  public void setAlipay(BigDecimal alipay) {
    this.alipay = alipay;
  }
}
