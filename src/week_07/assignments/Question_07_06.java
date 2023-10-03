package week_07.assignments;

public class Question_07_06 {
    public static void main(String[] args) {


        int[] primeNumbers = primeNumbers();
        printPrimeNumbers(primeNumbers);

    }

    private static void printPrimeNumbers(int[] primeNumbers) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(primeNumbers[i]);
            } else {
                System.out.printf(primeNumbers[i] + " ");
            }
        }
    }

    public static int[] primeNumbers() {
        int[] numbers = new int[50];
        int init = 2;
        int count = 0;
        while (count < numbers.length) {
            int squareOfInit = (int) Math.sqrt(init);
            boolean isPrime = true;
            for (int i = 2; i <= squareOfInit; i++) {
                if (init % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numbers[count] = init;
                count++;
            }
            init++;
        }
        return numbers;
    }
}
