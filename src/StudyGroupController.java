import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface StudyGroupController {

    void create(Teacher teacher, StudentGroup studentGroup);

    default List<Long> getIdsStudyGroup(StudyGroup studyGroup) {
        List<Long> groupListIds = new ArrayList<>();

        groupListIds.add(studyGroup.getTeacher().getTeacherId());
        groupListIds.addAll(studyGroup.getStudents().getStudentListIds());

        return groupListIds;
    }

    default StudyGroup createStudyGroup(Teacher teacher, StudentGroup studentGroup) {
        StudyGroupService studyGroupService = new StudyGroupService();
        return studyGroupService.createStudyGroup(teacher, studentGroup);
    }

    //    public StudyGroup createStudyGroup(Long teacherId, TeacherGroup teacherGroup, List<Long> studyGroupIds, StudentGroup enterStudentGroup) {
//        Teacher groupTeacher = null;
//        StudentGroup studentGroup = null;
//
//        Iterator<Teacher> teacherIterator = teacherGroup.iterator();
//        while (teacherIterator.hasNext()) {
//            Teacher teacher = (Teacher) teacherIterator.next();
//            if (teacher.getTeacherId().equals(teacherId)) {
//                groupTeacher = teacher;
//                break;
//            }
//        }
//
//        Iterator<Student> studentIterator = enterStudentGroup.iterator();
//        while (studentIterator.hasNext()) {
//            Student student = studentIterator.next();
//            if (studyGroupIds.contains(student.getSrudentId())) {
//                studentGroup.add(student);
//            }
//        }
//
//        return studyGroupService.createStudyGroup(groupTeacher, studentGroup);
//    }
}
