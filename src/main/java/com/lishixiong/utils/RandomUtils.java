package com.lishixiong.utils;

/**
 * @author lishixiong
 * @since 2018/10/25 11:09
 * Singularity Sky Technologies Limited.
 */
public class RandomUtils {
  public static int random() {
    return random(200);
  }

  public static int random(int t) {
    double random = Math.random();
    double number = random * 1000000;
    double v = number % t + 1;
    return (int) v;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      System.out.println(random());
    }
  }
}
