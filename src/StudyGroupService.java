import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, StudentGroup studentGroup) {
        return new StudyGroup(teacher, studentGroup);
    }
}
