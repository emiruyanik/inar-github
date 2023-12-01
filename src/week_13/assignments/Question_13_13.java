package week_13.assignments;

public class Question_13_13 {
    public static void main(String[] args) {
      Course course1=new Course("Math");

      course1.addStudent("emir");
      course1.addStudent("ipek");
      course1.addStudent("cabbar");
      course1.addStudent("betül");

        System.out.println(course1);
        Course course2=course1.clone();

        course2.dropStudent("emir");
        course2.addStudent("dicle");


        System.out.println(course2);

    }
}
