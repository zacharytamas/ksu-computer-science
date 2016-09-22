package assign01;

public class Student extends Person {

    private String classStatus;

    public Student(String name, String email, String classStatus) {
        super(name, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }
}
