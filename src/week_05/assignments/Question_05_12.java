package week_05.assignments;

public class Question_05_12 {
    public static void main(String[] args) {

        int init = 0;
        double squareOfInit = 0;

        while (squareOfInit <= 12000) {
            init++;
            squareOfInit = Math.pow(init, 2);


        }

        System.out.println("The smallest n is - " + init);


    }
}