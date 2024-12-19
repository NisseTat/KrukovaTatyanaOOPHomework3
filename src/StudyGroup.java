public class StudyGroup {
    private Teacher teacher;
    private StudentGroup studentGroup;

    public StudyGroup(Teacher teacher, StudentGroup studentGroup) {
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public StudentGroup getStudents() {
        return studentGroup;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", students=" + studentGroup +
                '}';
    }
}
