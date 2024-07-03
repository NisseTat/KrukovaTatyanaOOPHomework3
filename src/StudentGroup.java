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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}