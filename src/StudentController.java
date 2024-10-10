import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    //Задание 3
    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    //Задание 4
    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    //ДЗ
    public List<Stream> getSortedStreamList() {
        return streamService.getSortedStreamList();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
