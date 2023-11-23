package week_12.assignments;

import java.util.ArrayList;

public class Question_12_10 {
    public static void main(String[] args) {
        try {
            ArrayList<Object> arrayList = new ArrayList<>();
            while (true) {
                arrayList.add(new Object());
            }
        } catch (OutOfMemoryError error) {
            System.out.println("OutofMemoryException occurs " + error.getMessage());
        }
    }
}
