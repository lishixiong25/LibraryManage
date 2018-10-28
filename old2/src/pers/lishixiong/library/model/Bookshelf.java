package pers.lishixiong.library.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ilakeyc
 * @since 2018/10/28 12:25 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class Bookshelf {

  private Set<Book> books;

  public Set<Book> getBooks() {
    if (books == null) {
      books = new HashSet<>();
    }
    return books;
  }
}
