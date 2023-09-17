package week_06.assignments;


public class Question_06_12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);

    }

    public static void printChars(char ch1, char ch2, int numberOfPerLines) {
        int valueOfAsciiCodeOfCh1 = (int) ch1;
        int valueOfAsciiCodeOfCh2 = (int) ch2;
        int counter = 0;

        for (int i = valueOfAsciiCodeOfCh1; i <= valueOfAsciiCodeOfCh2; i++) {
            char ch = (char) i;
            counter++;
            if (counter % numberOfPerLines == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch + " ");
            }
        }
    }
}
