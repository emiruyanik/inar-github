package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {

        System.out.println("All the leap years from 101 to 2100");

        int counter = 0;
        String leapYears = "";

        for (int i = 101; i <= 2100; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                leapYears += i + " ";
                counter++;

            }
            if (counter % 10 == 0) {
                leapYears += "\n";
            }

        }
        System.out.println(leapYears);
    }
}
