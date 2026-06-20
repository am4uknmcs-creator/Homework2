import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/students.json");
        List<Student> students = mapper.readValue(file, new TypeReference<List<Student>>() {
        });

        System.out.println(students.get(1).getName());

        students.stream().forEach(System.out::println);
    }

}
