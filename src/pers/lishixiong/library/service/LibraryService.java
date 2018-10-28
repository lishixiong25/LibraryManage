package pers.lishixiong.library.service;

import pers.lishixiong.library.model.Book;
import pers.lishixiong.library.model.Bookshelf;

import java.util.List;

/**
 * @author ilakeyc
 * @since 2018/10/28 11:41 AM
 *
 * Singularity Sky Technologies Limited.
 */
public interface LibraryService {

  /**
   * 查找某个书架上所有的书
   *
   * @param indexOfShelf
   *
   * @return
   *
   * @throws Exception
   */
  List<Book> books(int indexOfShelf) throws Exception;

  void saveNewBook(Book book);

  List<Book> newBooks();

  void newShelf();

  int indexOfShelf(Book book);

  void moveToShelf(Book book, int indexOfShelf);

  void removeBook(Book book);

  List<Bookshelf> shelfs();

}
