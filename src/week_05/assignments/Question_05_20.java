package week_05.assignments;

public class Question_05_20 {
    public static void main(String[] args) {

        String primeNumbers = "";
        int init = 2;
        int counter = 0;
        boolean checking = true;

        System.out.println("The prime numbers between 2 and 1000, inclusive are:");

        while (init < 1001) {
            for (int i = 2; i <= init / 2; i++) {
                if (init % i == 0) {
                    checking = false;
                    break;
                } else {
                    checking = true;
                }
            }
            if (checking) {
                primeNumbers += init + " ";
                counter++;

                if (counter % 8 == 0) {
                    primeNumbers += "\n";
                }
            }
            init++;
        }
        System.out.println(primeNumbers);
    }
}


