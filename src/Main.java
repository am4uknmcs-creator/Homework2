import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/students.json");
        List<Student> students = mapper.readValue(file, new TypeReference<List<Student>>() {
        });

        students.stream().peek(s ->System.out.println("Студент " + s.getName()))
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(System.out::println,
                () -> System.out.println("Книга отсутствует")
        );
    }
}

