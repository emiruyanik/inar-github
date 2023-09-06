package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {

        double total1 = 0;
        double total2 = 0;


        for (int i = 1; i <= 50000; i++) {
            total1 =total1+ (1.0 / i);
        }

        System.out.println("Summation of series left to right:"+total1);

        for (int i = 50000; i >=1 ; i--) {
            total2=total2+(1.0/i);
        }

        System.out.println("Summation of series right to left:"+total2);

        double differenceBetweenTwoNumbers= total2-total1;

        System.out.println("Summation of series right to left-Summation of series left to right" +
          differenceBetweenTwoNumbers    );
    }

}
