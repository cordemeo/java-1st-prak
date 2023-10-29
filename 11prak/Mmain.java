import java.util.ArrayList;
import java.util.List;

public class Mmain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 3.5));
        students.add(new Student("Mary", 4.0));
        students.add(new Student("Bob", 3.2));
        students.add(new Student("Alice", 3.8));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getGpa());
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getGpa());
        }
    }
}
