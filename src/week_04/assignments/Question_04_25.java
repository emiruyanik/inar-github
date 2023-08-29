package week_04.assignments;

public class Question_04_25 {
    public static void main(String[] args) {

        char firstLetter = (char) ((int) (Math.random() * 26 + 65));
        char secondLetter = (char) ((int) (Math.random() * 26 + 65));
        char thirdLetter = (char) ((int) (Math.random() * 26 + 65));

        char firstNumber = (char) ((int) (Math.random() * 10 + 48));
        char secondNumber = (char) ((int) (Math.random() * 10 + 48));
        char thirdNumber = (char) ((int) (Math.random() * 10 + 48));

        System.out.printf("Generated plate number:%s%s%s%s%s%s",firstLetter,secondLetter,thirdLetter,firstNumber
        ,secondNumber,thirdNumber);


    }
}