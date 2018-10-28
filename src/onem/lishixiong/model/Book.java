package onem.lishixiong.model;

import java.util.Objects;

/**
 * @author ilakeyc
 * @since 2018/10/28 3:45 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class Book {
  private String name;
  private String detail;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, detail);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(name, book.name) &&
        Objects.equals(detail, book.detail);
  }

  @Override
  public String toString() {
    return "Book：" +
        "name='" + name + '\'' +
        ", detail='" + detail + '\'';
  }
}
