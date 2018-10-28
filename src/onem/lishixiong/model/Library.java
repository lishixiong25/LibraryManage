package onem.lishixiong.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author ilakeyc
 * @since 2018/10/28 3:45 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class Library {

  /**
   * 新书
   */
  private List<Book> newBooks;
  /**
   * 书架，包含了书的集合
   */
  private List<Set<Book>> shelves;


  public List<Book> getNewBooks() {
    if (newBooks == null) {
      newBooks = new ArrayList<>();
    }
    return newBooks;
  }

  public List<Set<Book>> getShelves() {
    if (shelves == null) {
      shelves = new ArrayList<>();
    }
    return shelves;
  }
}
