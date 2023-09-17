package week_06.assignments;


public class Question_06_10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 9999; i >= 2; i--) {
            boolean isPrime = isPrimeNumber(i);

            if (isPrime) {
                count++;
            }

        }
        System.out.println("The number of prime numbers less than 10000 is " + count);

    }

    public static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
