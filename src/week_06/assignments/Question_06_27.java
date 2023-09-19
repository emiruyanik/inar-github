package week_06.assignments;

public class Question_06_27 {
    public static void main(String[] args) {

        emirp(100);

    }

    public static void emirp(int totalEmirpNumbers) {
        int numb = 2;
        int counter = 0;
        while (counter < totalEmirpNumbers) {
            if (isPrime(numb) && isReversePrime(numb)) {
                counter++;
                if (counter % 10 == 0) {
                    System.out.println(numb);
                } else {
                    System.out.print(numb + " ");
                }

            }
            numb++;
        }

    }

    public static boolean isPrime(int numb) {
        boolean result = true;
        for (int i = 2; i <= numb / 2; i++) {
            if (numb % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isReversePrime(int numb) {
        boolean result = false;
        String number = numb + "";
        String reverseOfNumber = "";

        for (int i = 1; i <= number.length(); i++) {
            reverseOfNumber += number.charAt(number.length() - i);
        }

        int reverseOfNumb = Integer.parseInt(reverseOfNumber);
        if (reverseOfNumb != numb) {
            if (isPrime(reverseOfNumb)) {
                result = true;
            }
        }

        return result;
    }
}
