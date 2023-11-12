public class Mmmain {

    private static Studentt retrieveStudentFromDatabase(){
        Studentt student = new Studentt();
        student.setName("ryir");
        student.setRollNo("200");
        return student;
    }
    public static void main(String[] args) {
        Studentt model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
    }
}