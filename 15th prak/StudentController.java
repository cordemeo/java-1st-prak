public class StudentController {

    private Studentt model;
    private StudentView view;

    public StudentController(Studentt model, StudentView view){
        this.model = model;
        this.view = view;

    }

    public void setStudentName(String name){

        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String name){

        model.setRollNo(name);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());

    }
}