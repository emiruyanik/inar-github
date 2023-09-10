package week_05.assignments;

public class Question_05_18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j < 7 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i - j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }


    }
}
