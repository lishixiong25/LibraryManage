package com.lishixiong.models;

import java.math.BigDecimal;

/**
 * @author com.lishixiong
 * @since 2018/10/24 13:23
 * Singularity Sky Technologies Limited.
 */
public class Reader extends Librarian {
  @Override
  public String toString() {
    return "Reader{" +
        ", readTime=" + readTime +
        ", rate=" + rate +
        '}';
  }

  private BigDecimal readTime;
  private int rate;
  private BigDecimal time;


  public BigDecimal getReadTime() {
    return readTime;
  }

  public void setReadTime(BigDecimal readTime) {
    this.readTime = readTime;
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }
}
