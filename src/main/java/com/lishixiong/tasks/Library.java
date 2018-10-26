package com.lishixiong.tasks;

import com.lishixiong.models.Education;
import com.lishixiong.models.Librarian;
import com.lishixiong.models.Reader;
import com.lishixiong.models.Science;
import com.lishixiong.utils.IOUtils;
import com.lishixiong.utils.VerbReaderPool;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;

import static com.lishixiong.utils.IOUtils.getScanner;
import static com.lishixiong.utils.IOUtils.println;

/**
 * @author com.lishixiong
 * @since 2018/10/24 13:14
 * Singularity Sky Technologies Limited.
 */
public class Library implements Runnable {

  private VerbReaderPool readPool;
  private int LOOP = 1;
  private int OVER_READER = 0;
  private Librarian librarian;
  private Science science = null;
  private Education education = null;

  private ScheduledExecutorService executors;

  public Library(ScheduledExecutorService executors) {
    this.executors = executors;
    this.librarian = new Librarian();
    this.readPool = new VerbReaderPool();
    librarian.setName("二狗");
    librarian.setAccount(new BigDecimal("0"));
    librarian.setLanguage(new String("陕西话"));
    librarian.setPersonNumber(new String("001"));

  }

  @Override
  public void run() {
    try {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:MM:SS");
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
      println(MessageFormat.format("欢迎进入图书馆 {0}(输入e离开，其他任意键继续)", simpleDateFormat.format(new Date())));

      if ("e".equals(getScanner().nextLine())) {
        executors.shutdown();
        println("滚蛋吧");
      }

     for(Reader reader : readPool.getReaders()){
       if(reader == null){
         continue;
       }


       }
       String line = IOUtils.getScanner().nextLine();
     System.out.println(line);
     for(Reader reader : VerbReaderPool.get)




    } catch (Throwable t) {

    }

  }


}
