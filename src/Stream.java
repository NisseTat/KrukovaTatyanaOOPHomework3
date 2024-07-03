import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {

    public List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }


    @Override
    public int compareTo(Stream o) {
        if (o.studentGroupList.size() > this.studentGroupList.size()) {
            return -1;
        } else if (o.studentGroupList.size() < this.studentGroupList.size()) {
            return 1;
        } else return 0;
    }
}
