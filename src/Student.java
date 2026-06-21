import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Student {
    private final String name;
    private final List<Book> books;

    @JsonCreator
    public Student (@JsonProperty("name") String name, @JsonProperty("books") List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return  name;
    }
}
