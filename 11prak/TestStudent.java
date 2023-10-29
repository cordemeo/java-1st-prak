public class TestStudent {
    public static void main(String[] args) {
        // Создаем массив объектов класса Student
        Student1[] students = new Student1[5];
        students[0] = new Student1("John", "Doe", 123);
        students[1] = new Student1("Jane", "Doe", 456);
        students[2] = new Student1("Bob", "Smith", 789);
        students[3] = new Student1("Alice", "Johnson", 234);
        students[4] = new Student1("Tom", "Jones", 567);

        // Сортируем массив по полю iDNumber с помощью сортировки вставками
        for (int i = 1; i < students.length; i++) {
            Student1 key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }

        // Выводим отсортированный массив на экран
        for (Student1 student : students) {
            System.out.println(student);
        }
    }
}

class Student1 {
    private String firstName;
    private String lastName;
    private int iDNumber;

    public Student1(String firstName, String lastName, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + iDNumber + ")";
    }


}