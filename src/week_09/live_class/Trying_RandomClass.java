package week_09.live_class;

import java.util.Random;

public class Trying_RandomClass {
    public static void main(String[] args) {
        Random random1=new Random(3);
        for (int i = 0; i <10 ; i++) {
            System.out.print(random1.nextInt(1000)+" ");
        }
        System.out.println();
        Random random2=new Random(3);
        for (int i = 0; i <10 ; i++) {
            System.out.print(random2.nextInt(1000)+" ");
        }
        System.out.println();
        Random random3=new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.print(random3.nextInt(1000)+" ");
        }
    }
}
