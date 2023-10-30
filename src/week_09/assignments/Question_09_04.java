package week_09.assignments;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);


        int count = 0;
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
