import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
   private String title;
   private int year;
   private int pages;

   @JsonCreator
   public Book (@JsonProperty("title") String title, @JsonProperty("year")int year, @JsonProperty("pages")int pages) {
      this.title = title;
      this.year = year;
      this.pages = pages;
   }
}

