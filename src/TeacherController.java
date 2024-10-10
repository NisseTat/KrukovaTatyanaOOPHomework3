import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final StreamService streamService = new StreamService();
    private final TeacherView teacherView = new TeacherView();

    public void removeTeacherByFIO (String firstName, String lastName, String middleName) {
        teacherGroupService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    //Задание 3
    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherGroupService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    //Задание 4
    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherList = teacherGroupService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    //ДЗ
    public List<Stream> getSortedStreamList() {
        return streamService.getSortedStreamList();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherGroupService.createTeacher(firstName, lastName, middleName);
    }

    public void edit(
            String firstName,
            String lastName,
            String middleName,
            String newFirstName,
            String newLastName,
            String newMiddleName) {
        teacherGroupService.editTeacher(
                firstName,
                lastName,
                middleName,
                newFirstName,
                newLastName,
                newMiddleName);
    }

    public void showList(List<Teacher> teacherList) {

    }
}
