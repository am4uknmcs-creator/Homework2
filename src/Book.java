import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Book {
   private final String title;
   private final int year;
   private final int pages;

   @JsonCreator
   public Book (@JsonProperty("title") String title, @JsonProperty("year")int year, @JsonProperty("pages")int pages) {
      this.title = title;
      this.year = year;
      this.pages = pages;
   }
   public String getTitle() {
      return title;
   }
   public int getYear() {
      return year;
   }
   public int getPages() {
      return pages;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return pages == book.pages && year == book.year && Objects.equals(title, book.title);
   }
   @Override
   public int hashCode() {
      return Objects.hash(title, year, pages);
   }
}


