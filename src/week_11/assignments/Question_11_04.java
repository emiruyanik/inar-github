package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Enter a sequence of numbers ending with 0:");

        do {
            x = input.nextInt();
            if (x != 0) {
                arrayList.add(x);
            }
        } while (x != 0);
        Integer max = max(arrayList);
        System.out.print("The largest number in the list:"+max);
    }

    private static Integer max(ArrayList<Integer> arrayList) {
        Integer result = 0;

        for (Integer integer : arrayList) {
            if (integer > result) {
                result = integer;
            }
        }
        return result;
    }
}
