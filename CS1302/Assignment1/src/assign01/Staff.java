package assign01;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String email, double salary, String title) {
        super(name, email, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
