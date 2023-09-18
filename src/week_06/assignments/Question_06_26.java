package week_06.assignments;

public class Question_06_26 {
    public static void main(String[] args) {

        palindromicPrime(100);
    }

    public static void palindromicPrime(int number) {
        int numb = 2;
        int counter = 0;
        while (counter < number) {

            if (isPalindrome(numb) && isPrime(numb)) {
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

    public static boolean isPalindrome(int numb) {
        boolean result = true;
        String stringOfNumb = numb + "";
        for (int i = 0, j = 1; i <= stringOfNumb.length() / 2; i++, j++) {
            if (!(stringOfNumb.charAt(i) == stringOfNumb.charAt(stringOfNumb.length() - j))) {
                result = false;
            }

        }
        return result;
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
}
