import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Задание 1
//public class StudentGroup {
//
//    private List<Student> studentList;
//
//    public List<Student> getStudentList() {
//        return studentList;
//    }
//
//    public void setStudentList(List<Student> studentList) {
//        this.studentList = studentList;
//    }
//}

public class StudentGroup implements Iterable<Student> {

    private List<Student> studentList;
    private List<Long> studentListIds;

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Long> getStudentListIds() {
        return studentListIds;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName) {
        Student student = new Student(firstName, lastName, middleName);
        studentList.add(student);
        studentListIds.add(student.getSrudentId());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public void add(Student student) {
        studentList.add(student);
    }
}
