package com.lishixiong.tasks;

import com.lishixiong.models.Librarian;
import com.lishixiong.models.Reader;
import com.lishixiong.utils.BooksPool;

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

  private BooksPool booksPool;
  private Reader reader;
  private Librarian librarian;



  private ScheduledExecutorService executors;
  public Library(ScheduledExecutorService executors){
    this.executors =executors;
    this.librarian = new Librarian();
    this.booksPool = new BooksPool();
    librarian.setAccount(new BigDecimal("0"));
    librarian.setLanguage(new String("陕西话"));
    librarian.setPersonNumber(new String("001"));
    librarian.setDressed(new String("工作服"));
  }

  @Override
  public void run() {
    try{
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:MM:SS");
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
      println(MessageFormat.format("欢迎进入图书馆 {0}(输入e离开，其他任意键继续)",simpleDateFormat.format(new Date())));

      if("e".equals(getScanner().nextLine())){
        executors.shutdown();
        println("滚蛋吧");
      }



    }catch (Throwable t){

    }

  }



}
