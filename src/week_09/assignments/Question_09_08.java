package week_09.assignments;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setSpeed(3);
        fan1.setColour("yellow");
        System.out.println(fan1.getColour());
        System.out.println(fan1.isOn());


        Fan fan2 = new Fan();
        System.out.println(fan1.toString());

        System.out.println("_____________");
        System.out.println(fan2.getColour());
        System.out.println(fan2.isOn());
        System.out.println(fan2.toString());
        fan2.setSpeed(2);
        System.out.println(fan2.getSpeed());
        fan2.setOn(true);
        fan2.setSpeed(2);
        System.out.println(fan2.getSpeed());
        System.out.println("______________");
        Fan fan3 = new Fan(5, true, 25, "red");
        System.out.println(fan3.getSpeed());
    }


}
