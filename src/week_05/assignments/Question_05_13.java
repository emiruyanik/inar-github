package week_05.assignments;

public class Question_05_13 {
    public static void main(String[] args) {

        int init = 0;
        double cubeOfInit = 0;
        boolean checking = true;

        while (checking) {
            init++;
            cubeOfInit = Math.pow(init, 3);
            if (cubeOfInit > 12000) {
                init--;
                checking = false;
            }

        }
        System.out.println("The largest n is - " + init);
    }
}
