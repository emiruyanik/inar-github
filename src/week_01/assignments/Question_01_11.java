package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] args) {
        System.out.println("Population projection:312032486");
        System.out.println("Current population");
        System.out.println("One birth every 7 seconds");
        System.out.println("One death every 13 seconds");
        System.out.println("One new immigrant every 45 seconds");
        System.out.println("Yearly Population projection formula");
        System.out.println("Current population +((births pear year)");
        System.out.println("                   -(deaths pear year)");
        System.out.println("                   +(new immigrants pear year)");
        System.out.println("Year1 projection");
        System.out.println(312032486+(31536000/7)-(31536000/13)+(31536000/45));
        System.out.println("Year2 projection");
        System.out.println(314812582+(31536000/7)-(31536000/13)+(31536000/45));
        System.out.println("Year3 projection");
        System.out.println(317592678+(31536000/7)-(31536000/13)+(31536000/45));
        System.out.println("Year4 projection");
        System.out.println(320372774+(31536000/7)-(31536000/13)+(31536000/45));
        System.out.println("Year4 projection");
        System.out.println(323152870+(31536000/7)-(31536000/13)+(31536000/45));
    }
}
