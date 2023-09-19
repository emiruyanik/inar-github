package week_06.assignments;

public class Question_06_32 {
    public static void main(String[] args) {

        gameOfCrap(10000);

    }

    public static void gameOfCrap(int number) {
        int counterOfWinning = 0;
        int counterOfTotalGameNumbers=0;
        while (counterOfTotalGameNumbers < number) {
            int number1 = randomNumber();
            int number2 = randomNumber();
            int total1 = number1 + number2;


            System.out.printf("You rolled %d + %d = %d\n", number1, number2, total1);

            if (total1 == 7 || total1 == 11) {
                System.out.println("You win");
                counterOfWinning++;
                counterOfTotalGameNumbers++;
            } else if (total1 == 2 || total1 == 3 || total1 == 12) {
                System.out.println("You lose");
                counterOfTotalGameNumbers++;
            } else {
                System.out.println("Point is " + total1);
                int number3 = randomNumber();
                int number4 = randomNumber();
                int total2 = number3 + number4;

                System.out.printf("You rolled %d + %d = %d\n", number3, number4, total2);
                if (total1 == total2) {
                    System.out.println("You win");
                    counterOfWinning++;
                    counterOfTotalGameNumbers++;
                } else {
                    System.out.println("You lose");
                    counterOfTotalGameNumbers++;
                }

            }


        }
        System.out.println("Number of winning games "+counterOfWinning);
    }

    public static int randomNumber() {
        int number = (int) (Math.random() * 6 + 1);
        return number;
    }

}
