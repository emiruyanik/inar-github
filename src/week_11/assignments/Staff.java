package week_11.assignments;

public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                " title='" + title + '\''
                ;
    }
}
