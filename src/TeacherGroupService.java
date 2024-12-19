import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupService {

    private TeacherGroup teacherGroup;

    public void removeTeacherByFIO (String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName)
                && teacher.getLastName().equals(lastName)
                && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    //Задание 3
    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }

    //Задание 4
    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createTeacher(firstName, lastName, middleName);
    }

    public Teacher getTeacherById(Long teacherId) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    public void editTeacher(
            String firstName,
            String lastName,
            String middleName,
            String newFirstName,
            String newLastName,
            String newMiddleName) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName)
                    && teacher.getLastName().equals(lastName)
                    && teacher.getMiddleName().equals(middleName)) {
                teacher.setFirstName(newFirstName);
                teacher.setLastName(newLastName);
                teacher.setMiddleName(newMiddleName);
            }
        }
    }

//    public void showTeacherList(List<Teacher> teacherList) {
//        Iterator<Teacher> iterator = teacherGroup.iterator();
//        while (iterator.hasNext()) {
//            Teacher teacher = iterator.next();
//            System.out.println(teacher);
//        }
//    }

    public void showTeacherList(TeacherGroup teacherGroup) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            System.out.println(teacher);
        }
    }
}
