package onem.lishixiong.bootstrap;

import java.util.Scanner;

/**
 * @author ilakeyc
 * @since 2018/10/28 3:39 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class Main {

  public static void main(String[] args) {
    for (; ; ) {
      try {

        System.out.println("1，管理员、2，读者");

        int i = new Scanner(System.in).nextInt();

        if (i == 1) {
          ManagerSystem.run();
          // 启动管理员的循环
        }


        if (i == 2) {
          // 启动读者的循环
        }


      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }

}
