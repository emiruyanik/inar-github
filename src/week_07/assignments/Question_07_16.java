package week_07.assignments;


import static java.util.Collections.shuffle;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] numbers = new int[10000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

        }
        int[] shuffledNumbers = shuffleRandom(numbers);
        int key = (int) (Math.random() * (shuffledNumbers.length + 1));
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Execution time of invoking the linear search in milliseconds:" + timeOfLinearSearch(key, shuffledNumbers));
        System.out.println("Execution time of invoking the binary search in milliseconds:" + timeOfBinarySearch(key, numbers));


    }

    public static long timeOfBinarySearch(int key, int[] numbers) {
        long startingTime = System.currentTimeMillis();
        int min = 0;
        int max = numbers.length - 1;
        while (max >= min) {
            int mid = (max + min) / 2;
            if (numbers[mid] > key) {
                min = mid + 1;
            } else if (numbers[mid] == key) {
                break;
            } else {
                max = mid - 1;
            }
        }
        long endTime = System.currentTimeMillis();

        return endTime - startingTime;

    }

    public static long timeOfLinearSearch(int key, int[] shuffledNumbers) {
        long startingTime = System.currentTimeMillis();
        for (int i = 0; i < shuffledNumbers.length; i++) {
            int number = shuffledNumbers[i];
            if (number == key) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();

        return endTime - startingTime;
    }

    public static int[] shuffleRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * (array.length));
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;

        }
        return array;
    }


}
