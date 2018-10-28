package pers.lishixiong.library.dao;

import pers.lishixiong.library.model.Book;

import java.util.List;

/**
 * @author ilakeyc
 * @since 2018/10/28 11:42 AM
 *
 * Singularity Sky Technologies Limited.
 */
public interface BookDao {

  /**
   * 查找所有的新书
   *
   * @return 新书
   */
  List<Book> findNewBooks();

  /**
   * 保存一本新书
   *
   * @param book
   *     书
   */
  void saveNewBook(Book book);

  /**
   * 删除一本新书
   *
   * @param book
   *     书
   */
  void removeNewBook(Book book);

  /**
   * 查找书架上的书
   *
   * @param indexOfShelf
   *     书架序号
   *
   * @return 书架上的书
   */
  List<Book> findBooks(int indexOfShelf);

  /**
   * 向书架上存一本书
   *
   * @param indexOfShelf
   *     书架序号
   * @param book
   *     书
   */
  void saveBook(int indexOfShelf, Book book);

  /**
   * 从某个书架删除一本书
   *
   * @param indexOfShelf
   *     书架序号
   * @param book
   *     书
   */
  void removeBook(int indexOfShelf, Book book);
}
