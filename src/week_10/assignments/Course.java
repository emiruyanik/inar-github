package week_10.assignments;


import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int indexOfDropStudent = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                indexOfDropStudent = i;
                break;
            }
        }
        if (indexOfDropStudent == -1) {
            return;
        } else {
            if (indexOfDropStudent == 0) {
                String[] temp = new String[--numberOfStudents];
                System.arraycopy(students, 1, temp, 0, numberOfStudents);
                this.students = temp;
            } else if (indexOfDropStudent == getNumberOfStudents() - 1) {
                String[] temp = new String[--numberOfStudents];
                System.arraycopy(students, 0, temp, 0, getNumberOfStudents() - 1);
                this.students = temp;
            } else {
                String[] temp = new String[--numberOfStudents];
                System.arraycopy(students, 0, temp, 0, indexOfDropStudent);
                System.arraycopy(students, indexOfDropStudent + 1, temp, indexOfDropStudent, students.length - 1 - indexOfDropStudent);
                this.students = temp;
            }

        }

    }

    @Override
    public String toString() {
        return "Course{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
