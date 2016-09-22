package assign01;

public class Faculty extends Employee {

    private String officeHours;

    public Faculty(String name, String email, double salary, String officeHours) {
        super(name, email, salary);
        this.officeHours = officeHours;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
}
