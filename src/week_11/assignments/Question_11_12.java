package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the size of numbers:");
        int size = input.nextInt();

        System.out.print("Enter the integers:");
        for (int i = 0; i < size; i++) {
            int numb = input.nextInt();
            list.add(numb);
        }
        int total = sum(list);
        System.out.println("Sum of list:"+total);
    }

    public static int sum(ArrayList<Integer> list) {
        Integer result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }
}
