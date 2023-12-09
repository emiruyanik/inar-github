package week_14.assignments;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a DNA sequence:");
        String DNA = input.nextLine();

        Map<String, Integer> dnaMap = new HashMap<>();
        for (int i = 0; i <= DNA.length() - 5; i++) {
            String sub = DNA.substring(i, i + 5);
            if (dnaMap.containsKey(sub)) {
                dnaMap.replace(sub, dnaMap.get(sub) + 1);
            } else {
                dnaMap.put(sub, 1);
            }
        }
        List<String> keyDna = new ArrayList<>(dnaMap.keySet());
        for (String s : keyDna) {
            if (dnaMap.get(s) > 1) {
                System.out.println(s);
            }
        }
    }
}
