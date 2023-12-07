package week_14.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers for ArrayLis nums(enter -1 to stop):");

        List<Integer> integerList = new ArrayList<>();
        int numb;
        do {
            numb = input.nextInt();
            if (numb != -1) {
                integerList.add(numb);
            }

        } while (numb != -1);
        int count = 0;

        for (int i = 0; i < integerList.size(); i++) {
            int zeroOrNot = integerList.get(i);
            if (zeroOrNot == 0) {
                integerList.remove(i);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            integerList.add(0);
        }
        String arrangedList = integerList.toString();
        System.out.println("Arraylist after moving them to the end:" + arrangedList);
    }
}
