public class MVCPatternDemo {
    public static void main(String[] args) {
        
        Student model = retrieveStudentfromdatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);

        controller.updateView();

        //controller.setStudentName("Pedro ");
        //controller.updateView();
        }
    public static Student retrieveStudentfromdatabase(){
        Student student =new Student();
        student.setName("Roberto ");
        student.setRollNo("4893sg36");
        return student;

    }
}