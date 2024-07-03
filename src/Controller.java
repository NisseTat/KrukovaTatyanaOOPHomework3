import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    //Задание 3
    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    //Задание 4
    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    //ДЗ
    public List<Stream> getSortedStreamList() {
        return streamService.getSortedStreamList();
    }

}
