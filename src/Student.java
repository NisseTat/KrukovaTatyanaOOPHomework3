//Задание 1, 2
//public class Student {

//Задание 3
public class Student implements Comparable<Student> {

    private Long srudentId;
    private String firstName;
    private String lastName;
    private String middleName;

    public Long getSrudentId() {
        return srudentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setSrudentId(Long srudentId) {
        this.srudentId = srudentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.srudentId.compareTo(o.srudentId);
    }
}
