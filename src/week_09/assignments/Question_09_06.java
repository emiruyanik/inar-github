package week_09.assignments;

public class Question_09_06 {
    public static void main(String[] args) {
        int[] array = createRandomArray(100000);
        System.out.print("The execution time of sorting 100000 numbers using selection sort:");
        StopWatch stopWatch = new StopWatch();
        long elapsedTime = elapsedTime(stopWatch, array);
        System.out.print(elapsedTime);

    }

    public static long elapsedTime(StopWatch stopWatch, int[] array) {
        stopWatch.start();
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinNumb = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMinNumb > array[j]) {
                    currentMinNumb = array[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMinNumb;
            }
        }
        stopWatch.stop();

        return stopWatch.getElapsedTime();

    }

    public static int[] createRandomArray(int i) {
        int[] result = new int[i];
        for (int j = 0; j < i; j++) {
            result[j] = (int) (Math.random() * 100000);
        }
        return result;
    }
}
