package pers.lishixiong.library.service.impl;

import pers.lishixiong.library.dao.BookDao;
import pers.lishixiong.library.dao.impl.BookDaoImpl;
import pers.lishixiong.library.model.Book;
import pers.lishixiong.library.model.Bookshelf;
import pers.lishixiong.library.model.Library;
import pers.lishixiong.library.service.LibraryService;

import java.util.List;

/**
 * @author ilakeyc
 * @since 2018/10/28 12:37 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class LibraryServiceImpl implements LibraryService {

  private BookDao bookDao;

  public LibraryServiceImpl() {
    this.bookDao = new BookDaoImpl();
  }

  @Override
  public List<Book> books(int indexOfShelf) throws Exception {
    if (indexOfShelf < 0) {
      throw new Exception("No such shelf.");
    }

    List<Bookshelf> bookshelves = shelfs();
    if (bookshelves.size() < indexOfShelf) {
      throw new Exception("Index out of range");
    }

    return bookDao.findBooks(indexOfShelf);
  }

  @Override
  public void saveNewBook(Book book) {
    bookDao.saveNewBook(book);
  }

  @Override
  public List<Book> newBooks() {
    return bookDao.findNewBooks();
  }

  @Override
  public void newShelf() {
    shelfs().add(new Bookshelf());
  }

  @Override
  public int indexOfShelf(Book book) {
    List<Bookshelf> bookshelves = shelfs();
    for (int i = 0; i < bookshelves.size(); i++) {
      Bookshelf bookshelf = bookshelves.get(i);
      if (bookshelf.getBooks().contains(book)) {
        return i;
      }
    }

    return -1;
  }

  @Override
  public void moveToShelf(Book book, int indexOfShelf) {
    bookDao.removeNewBook(book);
    bookDao.saveBook(indexOfShelf, book);
  }

  @Override
  public void removeBook(Book book) {
    int indexOfShelf = indexOfShelf(book);
    if (indexOfShelf < 0) {
      bookDao.removeNewBook(book);
    } else {
      bookDao.removeBook(indexOfShelf, book);
    }
  }

  @Override
  public List<Bookshelf> shelfs() {
    return Library.getInstance().getBookshelves();
  }
}
