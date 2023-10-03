package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        int[] occurrenceOfRandomNumbers = occurrenceOfRandomNumbers(randomNumbers);
        printNumbs(occurrenceOfRandomNumbers);
    }

    public static void printNumbs(int[] occurrenceOfRandomNumbers) {
        System.out.println("Count for each number between 0 and 9");
        for (int i = 0; i < occurrenceOfRandomNumbers.length; i++) {
            System.out.println(i + "s: " + occurrenceOfRandomNumbers[i]);
        }
    }

    public static int[] occurrenceOfRandomNumbers(int[] randomNumbers) {
        int[] numbers = new int[10];
        for (int i = 0; i < randomNumbers().length; i++) {
            numbers[randomNumbers[i]]++;
        }
        return numbers;
    }

    public static int[] randomNumbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            int numb = (int) (Math.random() * 10);
            numbers[i] = numb;
        }
        return numbers;
    }
}
