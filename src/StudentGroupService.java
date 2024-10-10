import java.util.*;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName)
                && student.getLastName().equals(lastName)
                && student.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    //Задание 3
    public List<Student> getSortedStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    //Задание 4
    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
