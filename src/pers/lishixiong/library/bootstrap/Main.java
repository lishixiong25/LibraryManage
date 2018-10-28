package pers.lishixiong.library.bootstrap;

import pers.lishixiong.library.runloop.ManagerRunloop;
import pers.lishixiong.library.service.LibraryService;
import pers.lishixiong.library.service.impl.LibraryServiceImpl;

import java.util.Scanner;

/**
 * @author ilakeyc
 * @since 2018/10/28 11:37 AM
 *
 * Singularity Sky Technologies Limited.
 */
public class Main {

  private static LibraryService libraryService = new LibraryServiceImpl();

  public static void main(String[] args) {
    for (; ; ) {
      try {
        System.out.println("===========================\n" +
            "| 功能选择：                |\n" +
            "| 1. 管理员                |\n" +
            "| 2. 读者                  |\n" +
            "|==========================");

        int i = new Scanner(System.in).nextInt();
        if (i == 1) {
          ManagerRunloop.run();
        }

        if (i == 2) {

        }


      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }

}
