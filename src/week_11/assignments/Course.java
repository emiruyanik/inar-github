package week_11.assignments;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course() {

    }

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;

    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void dropStudent(String student) {
        if (this.students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        }
    }

    @Override
    public String toString() {
        return
                "courseName='" + courseName + '\'' +
                        ", students=" + students
                ;
    }
}
