package week_13.assignments;

import java.util.Arrays;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course() {

    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String studentName) {
        int indexOfDropStudent = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
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
    public Course clone() {
        try {
            Course clone = (Course) super.clone();
            clone.students = this.students.clone();
            return clone;
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
    }

    @Override
    public String toString() {
        return
                "courseName='" + courseName + "\n"+
                        "students=" + Arrays.toString(students) +"\n"+
                        "numberOfStudents=" + numberOfStudents
                ;
    }
}
