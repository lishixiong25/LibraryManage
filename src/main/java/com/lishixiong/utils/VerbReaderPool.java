package com.lishixiong.utils;

import com.lishixiong.models.Random;
import com.lishixiong.models.Reader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lishixiong
 * @since 2018/10/25 11:32
 * Singularity Sky Technologies Limited.
 */
public class VerbReaderPool {
  private static List<Reader> newReaders(){
    List<Reader>readers;       //创建读者的集合
    readers = new ArrayList<>();//各种类型的读者信息结合


    Reader reader1 = new Reader();
    reader1.setName("钢铁侠");
    reader1.setHairStyle("光头");
    reader1.setGender("男性");
    reader1.setDressed("马克III代");
    reader1.setRate(20);
    readers.add(reader1);

    Reader reader2 = new Reader();
    reader2.setName("钢铁人");
    reader2.setHairStyle("光头");
    reader2.setGender("男性");
    reader2.setDressed("马克I代");
    reader2.setRate(20);
    readers.add(reader2);


    Reader reader3 = new Reader();
    reader3.setName("虚空行者");
    reader3.setHairStyle("带个头盔");
    reader3.setGender("男性");
    reader3.setDressed("狂徒");
    reader3.setRate(20);
    readers.add(reader3);

    Reader reader4 = new Reader();
    reader4.setName("阿狸");
    reader4.setHairStyle("长发，有点卷发");
    reader4.setGender("女性");
    reader4.setDressed("耐克");
    reader4.setRate(20);
    readers.add(reader4);


    return readers;
  }
  private List<Reader> readers;
  public List<Reader> getReaders(){
    if(readers == null){
      readers = new ArrayList<>();
    }
    return readers;
  }
  public void newReader(){
    ArrayList<Random> dz = new ArrayList<Random>(newReader());
    Random random =ReadRandomUtils.random(dz);
    Reader reader = (Reader) random;
    getReaders().add(reader);

  }
  public void round(){
    for(Reader reader:getReaders()){
      BigDecimal lostTime = reader.getReadTime();
      BigDecimal newLostTime = lostTime.multiply(reader.getReadTime());
      if(newLostTime.compareTo(BigDecimal.ZERO)<=0){
        newLostTime = BigDecimal.ZERO;
      }
      reader.setTime(newLostTime);
    }
  }
  public List<Reader>removeOverReaders(){
    List<Reader> over = new ArrayList<>();
    List<Reader> readers = getReaders();
    for(Reader reader : readers){
      if(reader.getTime().compareTo(BigDecimal.ZERO) <= 0){
        over.add(reader);
      }
    }
    for(Reader r :over){
      getReaders().remove(r);
    }
    return over;
  }

  public static void main(String[] args) {
    VerbReaderPool pool = new VerbReaderPool();
    List<Reader> readers = pool.getReaders();
    System.out.println(readers.toString());
    pool.newReader();
    System.out.println(pool.getReaders().toString());
    pool.round();
    System.out.println(pool.getReaders().toString());
  }


}
