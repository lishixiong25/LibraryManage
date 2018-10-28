package pers.lishixiong.library.dao.impl;

import pers.lishixiong.library.dao.BookDao;
import pers.lishixiong.library.model.Book;
import pers.lishixiong.library.model.Library;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ilakeyc
 * @since 2018/10/28 12:41 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class BookDaoImpl implements BookDao {
  @Override
  public List<Book> findNewBooks() {
    return Library.getInstance().getNewBooks();
  }

  @Override
  public void saveNewBook(Book book) {
    Library.getInstance().getNewBooks().add(book);
  }

  @Override
  public void removeNewBook(Book book) {
    Library.getInstance().getNewBooks().remove(book);
  }

  @Override
  public List<Book> findBooks(int indexOfShelf) {
    return new ArrayList<>(Library.getInstance().getBookshelves().get(indexOfShelf).getBooks());
  }

  @Override
  public void saveBook(int indexOfShelf, Book book) {
    Library.getInstance().getBookshelves().get(indexOfShelf).getBooks().add(book);
  }

  @Override
  public void removeBook(int indexOfShelf, Book book) {
    Library.getInstance().getBookshelves().get(indexOfShelf).getBooks().remove(book);
  }
}
