package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 10 == 0 && i <= 100) {
                System.out.println(getRandomUppercaseLetter());
            } else if (i % 10 != 0 && i <= 100) {
                System.out.print(getRandomUppercaseLetter() + " ");
            } else if (i % 10 == 0 && i > 100) {
                System.out.println(getRandomDigitCharacter());

            } else {
                System.out.print(getRandomDigitCharacter() + " ");
            }

        }

    }

    public static char getRandomCharacter(char ch1, char ch2) {
        char ch = (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        return ch;
    }

    public static char getRandomUppercaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}
