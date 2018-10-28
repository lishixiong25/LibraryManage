package com.lishixiong.tasks;

import com.lishixiong.models.Education;
import com.lishixiong.models.Librarian;
import com.lishixiong.models.Science;
import com.lishixiong.utils.BooksUtils;
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

      println("1增加图书\n" +
          "2更改图书\n" +
          "3查看图书\n" +
          "4下架图书");


      if ("e".equals(getScanner().nextLine())) {
        executors.shutdown();
        println("滚蛋吧");
      }
      private String name;             //书名
      private String size;             //书的大小
      private String type;             //类型
      private String pictureQuality;   //画质
      private String suitable;         //适应年龄
      private String location;         //位置
      private BigDecimal price;        //价格
      private int rate;                //随机出现的几率
      int i = getScanner().nextInt();
      switch (i){
        case 1:{
          println("书名，类型，画质，适应年龄，位置，价格");
          BooksUtils.create

        }
      }



//     for(Reader reader : readPool.getReaders()){
//       if(reader == null){
//         continue;
//       }
//
//
//       }
//       String line = IOUtils.getScanner().nextLine();
//     System.out.println(line);
//     for(Reader reader : VerbReaderPool.getReaders()){
//       BigDecimal readTimeLost = ReadRandomUtils.calculateReadlost()
//     }




    } catch (Throwable t) {

    }

  }


}
