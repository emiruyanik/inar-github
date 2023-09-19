package week_06.assignments;

public class Question_06_29 {
    public static void main(String[] args) {

        printTwinNumber(1000);
    }

    public static void printTwinNumber(int number) {
        int firstNumb = 2;
        int secondNumb = 4;
        while (secondNumb < number) {
            if (isTwinNumber(firstNumb, secondNumb)) {
                System.out.printf("(%d,%d)\n", firstNumb, secondNumb);
            }
            firstNumb++;
            secondNumb++;
        }
    }

    public static boolean isTwinNumber(int firstNumb, int secondNumb) {
        boolean result = false;
        if (Question_06_27.isPrime(firstNumb) && Question_06_27.isPrime(secondNumb)) {
            result = true;
        }
        return result;
    }
}
