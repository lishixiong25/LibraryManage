package com.lishixiong.utils;

import java.util.Scanner;

/**
 * @author com.lishixiong
 * @since 2018/10/24 12:59
 * Singularity Sky Technologies Limited.
 */
public class IOUtils {
  public static void println(String string) {
    System.out.println(string);
  }

  public static Scanner getScanner() {
    return new Scanner(System.in);
  }
}
