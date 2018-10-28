package onem.lishixiong.bootstrap;

import onem.lishixiong.model.Book;
import onem.lishixiong.model.Library;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ilakeyc
 * @since 2018/10/28 3:41 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class ManagerSystem {

  private static Library library = new Library();

  public static void run() {
    for (; ; ) {
      try {

        System.out.println("/*\n" +
            "         * 1，查看书架\n" +
            "         * 2，管理图书（把新书放到书架）\n" +
            "         * 3，新增图书（填新书的信息）\n" +
            "         * 4，查询图书（看一下书架有哪些，书架上有那些书）\n" +
            "         * 5，新建一个书架\n" +
            "         * */");

        int operation = new Scanner(System.in).nextInt();

        switch (operation) {
          case 1: {
            /* 查看书架 */
            printShelves();
            break;
          }

          case 2: {
            /* 管理图书 */
            cleanupNewBooks();
            break;
          }

          case 3: {
            /* 新增图书 */
            createNewBook();
            break;
          }

          case 4: {
            /* 查询书籍 */
            printBooks();
            break;
          }

          case 5: {
            /* 新建一个书架 */
            createShelf();
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

  private static void printShelves() {
    List<Set<Book>> shelves = library.getShelves();
    for (int i = 0; i < shelves.size(); i++) {
      Set<Book> books = shelves.get(i);
      System.out.println("【" + i + "】一共有" + books.size() + "本书");
    }
  }

  /**
   * 整理一本新书
   */
  private static void cleanupNewBooks() {
    // 输出所有的新书
    List<Book> newBooks = library.getNewBooks();

    for (Book newBook : newBooks) {

      System.out.println(newBook.toString());
      System.out.println("将此书归类到书架吗？输入书架号归类，-1 跳过本书：");

      int i = new Scanner(System.in).nextInt();
      if (i == -1) {
        continue;
      }

      // 将这本书从新书中移除，并且添加到指定的书架上。
      library.getNewBooks().remove(newBook);
      library.getShelves().get(i).add(newBook);
      return;
    }
  }

  /**
   * 新建一本书
   */
  private static void createNewBook() {
    System.out.println("书名：");
    String name = new Scanner(System.in).nextLine();
    System.out.println("介绍：");
    String detail = new Scanner(System.in).nextLine();
    Book book = new Book();
    book.setName(name);
    book.setDetail(detail);
    library.getNewBooks().add(book);
  }

  private static void printBooks() {
    // 打印出所有的书架
    printShelves();
    // 用户选择一个书架输出所有的书
    System.out.println("选择一个书架序号查看藏书：");
    int indexOfShelf = new Scanner(System.in).nextInt();
    Set<Book> books = library.getShelves().get(indexOfShelf);
    for (Book book : books) {
      System.out.println(book.toString());
    }
  }

  private static void createShelf() {
    library.getShelves().add(new HashSet<>());
    printShelves();
  }

}
