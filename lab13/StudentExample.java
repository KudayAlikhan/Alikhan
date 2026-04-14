import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 20, 85),
                new Student("Jane", 22, 92),
                new Student("Jack", 20, 78)
        );

        // Бағасы > 80 студенттерді сүзу
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getGrade() > 80)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        filteredStudents.forEach(System.out::println);  // Jane, John
    }
}
import java.util.Arrays;
import java.util.List;

