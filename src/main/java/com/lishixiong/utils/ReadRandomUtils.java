package com.lishixiong.utils;

import java.util.*;

import static com.lishixiong.utils.RandomUtils.random;

/**
 * @author lishixiong
 * @since 2018/10/24 19:39
 * Singularity Sky Technologies Limited.
 */
public class ReadRandomUtils {
  public static Integer randomTag(List<Integer> tags) {
    int random = random();
    Map<Set<Integer>, Integer> areas = new HashMap<>(tags.size());
    int t = 1;
    for (Integer r : tags) {
      Set<Integer> area = new HashSet<>();
      for (int i = 0; i < r; i++) {
        area.add(t);
        t++;
      }
      areas.put(area, r);
    }
    for (Map.Entry<Set<Integer>, Integer> entry : areas.entrySet()) {
      if (entry.getKey().contains(random)) {
        return entry.getValue();
      }
    }
    return null;
  }

  public static void main(String[] args) {
    List<Random> randoms = new ArrayList<>();
    randoms.add(new Random() {
      @Override
      public int randomTag() {
        return 15;
      }
    });
    randoms.add(new Random() {
      @Override
      public int randomTag() {
        return 5;
      }
    });
    for (int i = 0; i < 100; i++) {
      Random random = random(randoms);
      if (random == null) {
        System.out.println("正在玩手机");
        continue;


      }
      if (random.randomTag() == 25) {
        System.out.println("来新书了");
      }
    }
  }

}
