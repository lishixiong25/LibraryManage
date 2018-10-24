package com.lishixiong.utils;

import com.lishixiong.models.Books;

import java.util.ArrayList;
import java.util.List;

/**
 * @author com.lishixiong
 * @since 2018/10/24 14:07
 * Singularity Sky Technologies Limited.
 */
public class BooksPool {
  private static final List<Books> BOOKS;

  static {
    BOOKS = new ArrayList<>();
    Books Books1 = new Books();
    Books1.setName("英雄联盟");
    Books1.setType("战争题材");
    Books1.setPictureQuality("彩色");
    Books1.setLocation("1号书架");
    Books1.setSuitable("婴幼儿");
    Books1.setSize("400/小时");
    BOOKS.add(Books1);

    Books Books2 = new Books();
    Books2.setName("坦克世界");
    Books2.setType("战争题材");
    Books2.setPictureQuality("黑白");
    Books2.setLocation("1号书架");
    Books2.setSuitable("婴幼儿");
    Books2.setSize("450/小时");
    BOOKS.add(Books2);

    Books Books3 = new Books();
    Books3.setName("金瓶梅");
    Books3.setType("教育专用");
    Books3.setPictureQuality("黑白");
    Books3.setLocation("2号书架");
    Books3.setSuitable("青少年");
    Books3.setSize("800/小时");
    BOOKS.add(Books3);

    Books Books4 = new Books();
    Books4.setName("男人帮");
    Books4.setType("教育专用");
    Books4.setPictureQuality("彩色");
    Books4.setLocation("2号书架");
    Books4.setSuitable("青少年");
    Books4.setSize("800/小时");
    BOOKS.add(Books4);

    Books Books5 = new Books();
    Books5.setName("如何养猪");
    Books5.setType("理财类");
    Books5.setPictureQuality("彩色");
    Books5.setLocation("3号书架");
    Books5.setSuitable("全龄");
    Books5.setSize("1400/小时");
    BOOKS.add(Books5);

    Books Books6 = new Books();
    Books6.setName("如何一夜暴富");
    Books6.setType("理财类");
    Books6.setPictureQuality("彩色");
    Books6.setLocation("3号书架");
    Books6.setSuitable("全龄");
    Books6.setSize("4000/小时");
    BOOKS.add(Books6);


    Books Books7 = new Books();
    Books7.setName("古今中外国家大事");
    Books7.setType("历史");
    Books7.setPictureQuality("黑白");
    Books7.setLocation("4号书架");
    Books7.setSuitable("成年");
    Books7.setSize("200/小时");
    BOOKS.add(Books7);

    Books Books8 = new Books();
    Books8.setName("金瓶梅删减版");
    Books8.setType("历史");
    Books8.setPictureQuality("黑白");
    Books8.setLocation("4号书架");
    Books8.setSuitable("青少年");
    Books8.setSize("8000/小时");
    BOOKS.add(Books8);


  }


}

