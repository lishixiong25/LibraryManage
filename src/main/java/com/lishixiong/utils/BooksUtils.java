package com.lishixiong.utils;

import com.lishixiong.models.Books;
import com.lishixiong.models.Education;
import com.lishixiong.models.Random;
import com.lishixiong.models.Science;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lishixiong
 * @since 2018/10/25 11:17
 * Singularity Sky Technologies Limited.
 */
public class BooksUtils {
  private static List<Books> books = new ArrayList<>();

  public static void get(int index) {
    if (index >= books.size()) {
      throw new Error("没有这个型号");
    }
    Books book = books.get(index);
    System.out.println(book.toString());
  }

  public static void update(int index, String name, String type, String pictureQuality, String suitable, BigDecimal price) {
    Books book = books.get(index);
    book.setName(name);
    book.setType(type);
    book.setPictureQuality(pictureQuality);
    book.setSuitable(suitable);
    book.setPrice(price);
  }

  public static void read() {
    for (int i = 0; i < books.size(); i++) {
      Books book = books.get(i);
      System.out.println("<" + i + ">" + book.toString());
    }
  }

  public static void create(String name,String type,String pictureQuality,String suitable,BigDecimal price){

  }


  private static final int BOOKS_SCIENCE = 30;
  private static final int BOOKS_EDUCATION = 40;
  private static final List<Science> SCIENCE;
  private static final List<Education> EDUCATION;

  static {
    SCIENCE = new ArrayList<>();
    Science science1 = new Science();
    science1.setName("英雄联盟");
    science1.setType("战争题材");
    science1.setPictureQuality("彩色");
    science1.setLocation("1号书架");
    science1.setSuitable("婴幼儿");
    science1.setSize("400/小时");
    SCIENCE.add(science1);

    Science science2 = new Science();
    science2.setName("坦克世界");
    science2.setType("战争题材");
    science2.setPictureQuality("黑白");
    science2.setLocation("1号书架");
    science2.setSuitable("婴幼儿");
    science2.setSize("450/小时");
    SCIENCE.add(science2);

    Science science3 = new Science();
    science3.setName("金瓶梅");
    science3.setType("教育专用");
    science3.setPictureQuality("黑白");
    science3.setLocation("2号书架");
    science3.setSuitable("青少年");
    science3.setSize("800/小时");
    SCIENCE.add(science3);

    Education education1 = new Education();
    education1.setName("男人帮");
    education1.setType("教育专用");
    education1.setPictureQuality("彩色");
    education1.setLocation("2号书架");
    education1.setSuitable("青少年");
    education1.setSize("800/小时");
    EDUCATION.add(education1);

    Education education2 = new Education();
    education2.setName("如何养猪");
    education2.setType("理财类");
    education2.setPictureQuality("彩色");
    education2.setLocation("3号书架");
    education2.setSuitable("全龄");
    education2.setSize("1400/小时");
    EDUCATION.add(education2);

    Education education3 = new Education();
    education3.setName("如何一夜暴富");
    education3.setType("理财类");
    education3.setPictureQuality("彩色");
    education3.setLocation("3号书架");
    education3.setSuitable("全龄");
    education3.setSize("4000/小时");
    EDUCATION.add(education3);


    Education education4 = new Education();
    education4.setName("古今中外国家大事");
    education4.setType("历史");
    education4.setPictureQuality("黑白");
    education4.setLocation("4号书架");
    education4.setSuitable("成年");
    education4.setSize("200/小时");
    EDUCATION.add(education4);

    Education education5 = new Education();
    education5.setName("金瓶梅删减版");
    education5.setType("历史");
    education5.setPictureQuality("黑白");
    education5.setLocation("4号书架");
    education5.setSuitable("青少年");
    education5.setSize("8000/小时");
    EDUCATION.add(education5);
  }

  public static Map<String, Books> getRandomBooks() {
    Map<String, Books> result = new HashMap<>();
    List<Random> s = new ArrayList<Random>(SCIENCE);
    Random es = ReadRandomUtils.random(s);
    if (es != null) {
      result.put("science", (Books) es);
    }
    List<Random> e = new ArrayList<Random>(EDUCATION);
    Random er = ReadRandomUtils.random(e);
    if (er != null) {
      result.put("education", (Education) er);
    }
    return result;

  }

  private static int getBooksAbc() {
    List<Integer> tags = new ArrayList<>();
    tags.add(BOOKS_SCIENCE);
    tags.add(BOOKS_EDUCATION);
    Integer tag = ReadRandomUtils.randomTag(tags);
    if (tag == null) {
      return -1;
    }
    return tag;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      Map<String, Books> randomBooks = getRandomBooks();
      if (randomBooks == null) {
        continue;
      }
      Books w = randomBooks.get("w");
      if (w == null) {
        continue;
      }
    }
  }


}
