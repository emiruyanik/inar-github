package week_13.assignments;

import java.util.ArrayList;

public class Question_13_02 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(1);
        numbers.add(17.8);
        shuffle(numbers);

        System.out.println(numbers);
    }

    public static void shuffle(ArrayList<Number> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int random = (int) (Math.random() * numbers.size());
            Number tempNumber = numbers.get(i);
            numbers.set(i, numbers.get(random));
            numbers.set(random,tempNumber);
        }
    }
}
