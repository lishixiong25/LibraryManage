package com.lishixiong;

import com.lishixiong.tasks.Library;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.lishixiong.utils.IOUtils.getScanner;
import static com.lishixiong.utils.IOUtils.println;

/**
 * @author com.lishixiong
 * @since 2018/10/24 12:55
 * Singularity Sky Technologies Limited.
 */
public class Main {
  public static void main(String[] args) {
    for (; ; )
      try {
        println("是否进入图书馆：\n" +
            "0、开玩笑，不去！\n" +
            "1、进去看看!");
        int i = getScanner().nextInt();
        switch (i) {
          case 0: {
            println("去看电影了");
            return;
          }
          case 1: {
            launchLibraryTerminated();
            break;
          }
          default: {
            break;
          }
        }

      } catch (Throwable t) {
        println("——————————————————————————————————————————————————");

      }
  }

  private static void launchLibraryTerminated() {
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    scheduledExecutorService.scheduleWithFixedDelay(new Library(scheduledExecutorService), 1, 1, TimeUnit.MILLISECONDS);

    for (; ; ) {
      if (scheduledExecutorService.isTerminated()) {
        println("已离开图书馆\n");
        break;
      }
    }
  }
}
