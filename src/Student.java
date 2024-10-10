//Задание 1, 2
//public class Student {

//Задание 3
//public class Student implements Comparable<Student> {
//
//
//    private Long srudentId;
//    private String firstName;
//    private String lastName;
//    private String middleName;
//
//    public Long getSrudentId() {
//        return srudentId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setSrudentId(Long srudentId) {
//        this.srudentId = srudentId;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.srudentId.compareTo(o.srudentId);
//    }
//}

//    Задание 4. Перенесено в класс User в Семинаре 4(8) и изменено с класса на компаратор
public class Student extends User implements Comparable<Student> {


    private Long srudentId;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getSrudentId() {
        return srudentId;
    }

    public void setSrudentId(Long srudentId) {
        this.srudentId = srudentId;
    }

    @Override
    public int compareTo(Student o) {
        return this.srudentId.compareTo(o.srudentId);
    }
}