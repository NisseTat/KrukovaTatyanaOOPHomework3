import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {

    private List<Teacher> teacherList;
    private List<Long> teacherListIds;


    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Long> getTeacherListIds() {
        return teacherListIds;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teacherList.add(teacher);
        teacherListIds.add(teacher.getTeacherId());
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
