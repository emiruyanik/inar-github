package week_05.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the commission sought:");
        double commissionSought = input.nextDouble();
        int necessarySaleAmount = 0;
        double formula = 0;

        if (commissionSought <= 400) {
            while (commissionSought > formula) {


                necessarySaleAmount++;
                formula = necessarySaleAmount * 0.08;
            }


            System.out.println(necessarySaleAmount);


        } else if (commissionSought <= 900) {

            while (commissionSought - 400 > formula) {
                necessarySaleAmount++;
                formula = necessarySaleAmount * 0.10;
            }


        } else {
            while (commissionSought - 900 > formula) {
                necessarySaleAmount++;
                formula = necessarySaleAmount * 0.12;
            }
        }


        if (commissionSought > 400&&commissionSought<901) {
            necessarySaleAmount += 5000;
        } else if (commissionSought>901) {
            necessarySaleAmount+=10000;
        }
        System.out.println("Minimum sale to earn $"+commissionSought+" "+necessarySaleAmount);
    }
}
