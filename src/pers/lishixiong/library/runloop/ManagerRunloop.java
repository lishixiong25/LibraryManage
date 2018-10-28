package pers.lishixiong.library.runloop;

import pers.lishixiong.library.model.Book;
import pers.lishixiong.library.model.Bookshelf;
import pers.lishixiong.library.service.LibraryService;
import pers.lishixiong.library.service.impl.LibraryServiceImpl;

import java.text.MessageFormat;
import java.util.List;
import java.util.Scanner;

/**
 * @author ilakeyc
 * @since 2018/10/28 12:58 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class ManagerRunloop {

  private static LibraryService libraryService = new LibraryServiceImpl();

  public static void run() {
    for (; ; ) {

      try {

        System.out.println("===========================\n" +
            "| 功能选择：                 |\n" +
            "| 1. 新书                   |\n" +
            "| 2. 书架序号                |\n" +
            "| 3. 查询新书                \n" +
            "| 4. 整理新书              \n " +
            "| 5. 查看书架               \n" +
            "| 6. 新书架                 \n" +
            "| 0. 退出\n" +
            "|==========================");


        int i = new Scanner(System.in).nextInt();

        switch (i) {
          case 0: {
            return;
          }
          case 1: {
            newBook();
            break;
          }
          case 2: {
            shelfs();
            break;
          }
          case 3: {
            newBooks();
            break;
          }
          case 4: {
            manageBooks();
            break;
          }
          case 5: {
            showBooks();
            break;
          }
          case 6: {
            newShelf();
            break;
          }
          default:
            break;
        }


      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }

  private static void newBook() {
    System.out.println("书名");
    String name = new Scanner(System.in).nextLine();
    System.out.println("描述");
    String description = new Scanner(System.in).nextLine();

    Book book = new Book(name, description, Book.TYPE_SINCE);

    libraryService.saveNewBook(book);
  }

  private static void shelfs() {
    List<Bookshelf> shelfs = libraryService.shelfs();
    if (shelfs.isEmpty()) {
      System.out.println("没有书架。");
      return;
    }
    for (Bookshelf shelf : shelfs) {
      int i = shelfs.indexOf(shelf);
      System.out.println(MessageFormat.format("【{0}】\t{1}本书", i, shelf.getBooks().size()));
    }
  }

  private static void newBooks() {
    List<Book> books = libraryService.newBooks();
    for (Book book : books) {
      System.out.println(book.toString());
    }
  }

  private static void manageBooks() {
    List<Book> books = libraryService.newBooks();
    Book templateBook = null;
    int index = -1;
    for (Book book : books) {
      System.out.println(book.toString());
      System.out.println("移动到书架吗？输入书架序号或 -1 跳过本书：");
      int i = new Scanner(System.in).nextInt();
      if (-1 == i) {
        continue;
      }
      templateBook = book;
      index = i;
      break;
    }

    if (templateBook == null || index == -1) {
      return;
    }
    libraryService.moveToShelf(templateBook, index);
  }

  private static void showBooks() {
    shelfs();
    List<Bookshelf> shelfs = libraryService.shelfs();
    if (shelfs.isEmpty()) {
      return;
    }
    System.out.println("选择书架：");
    int i = new Scanner(System.in).nextInt();
    try {
      List<Book> books = libraryService.books(i);
      for (Book book : books) {
        System.out.println(book);
      }
    } catch (Exception e) {
      System.out.println("没有这个书架。");
    }
  }

  private static void newShelf() {
    libraryService.newShelf();
    shelfs();
  }
}
