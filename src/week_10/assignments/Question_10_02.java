package week_10.assignments;

public class Question_10_02 {
    public static void main(String[] args) {
        BMI emir = new BMI("emir", 27, 145, 70);
        System.out.println("name:" + emir.getName());
        System.out.println("age:" + emir.getAge());
        System.out.println("Bmi:" + emir.getBMI());
        System.out.println("status:" + emir.getStatus());

        BMI ahmet = new BMI("ahmet", 27, 215, 70);
        System.out.println("name:" + ahmet.getName());
        System.out.println("age:" + ahmet.getAge());
        System.out.println("Bmi:" + ahmet.getBMI());
        System.out.println("status:" + ahmet.getStatus());

    }
}
