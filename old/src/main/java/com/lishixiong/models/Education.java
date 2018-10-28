package com.lishixiong.models;

/**
 * @author lishixiong
 * @since 2018/10/25 11:23
 * Singularity Sky Technologies Limited.
 */
public class Education extends Books{
  @Override
  public int randomTag(){
    return getRate();
  }
}
