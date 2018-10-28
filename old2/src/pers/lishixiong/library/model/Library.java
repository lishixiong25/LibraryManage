package pers.lishixiong.library.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ilakeyc
 * @since 2018/10/28 11:44 AM
 *
 * Singularity Sky Technologies Limited.
 */
public class Library {
  private static Library ourInstance = new Library();
  private List<Book> newBooks;
  private List<Bookshelf> bookshelves;

  private Library() {
  }

  public static Library getInstance() {
    return ourInstance;
  }

  public List<Book> getNewBooks() {
    if (newBooks == null) {
      newBooks = new ArrayList<>();
    }
    return newBooks;
  }

  public List<Bookshelf> getBookshelves() {
    if (bookshelves == null) {
      bookshelves = new ArrayList<>();
    }
    return bookshelves;
  }
}
