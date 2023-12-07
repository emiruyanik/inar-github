package week_13;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        Integer[]list2=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(list2));
        Collections.sort(list);
        String arr=list.toString();
        System.out.println(arr);

        list.remove(1);
        list.add(0,5);
        System.out.println(list.get(1));


    }
}
