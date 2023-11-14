package week_10.assignments;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudent("emir");
        course.addStudent("ahmet");
        course.addStudent("üzeyir");
        course.addStudent("serhat");
        course.addStudent("sefa");
        String[] str = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(str[i]);
        }
        System.out.println("_________________________________________-");
        course.dropStudent("emir");
        str = course.getStudents();
        System.out.println(course.getNumberOfStudents());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(str[i]);
        }
        course.dropStudent("serhat");
        System.out.println(course.toString());
        course.dropStudent("ipek");
        System.out.println(course.toString());
    }
}
