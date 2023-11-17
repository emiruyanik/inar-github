package week_11.assignments;

public class Question_11_05 {
    public static void main(String[] args) {
        Course course = new Course("Chem");
        course.addStudent("Sefa Atakul");
        course.addStudent("Ali İhsan");
        course.addStudent("Ali Oğuzhan");
        course.addStudent("Üzeyir Şur");
        course.addStudent("Serhat Gülbas");
        System.out.println(course);
        System.out.println(course.getNumberOfStudents());

        course.dropStudent("Emir Uyanık");
        course.dropStudent("Serhat Gülbas");
        System.out.println(course);
        System.out.println(course.getNumberOfStudents());

    }
}
