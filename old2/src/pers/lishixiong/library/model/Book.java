package pers.lishixiong.library.model;

import java.util.Objects;

/**
 * @author ilakeyc
 * @since 2018/10/28 12:22 PM
 *
 * Singularity Sky Technologies Limited.
 */
public class Book {

  public static final int TYPE_SINCE = 1;

  private String name;
  private String description;
  private int type;

  public Book(String name, String description, int type) {
    this.name = name;
    this.description = description;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return type == book.type &&
        Objects.equals(name, book.name) &&
        Objects.equals(description, book.description);
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", type=" + type +
        '}';
  }
}
