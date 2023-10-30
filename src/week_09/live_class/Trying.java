package week_09.live_class;

import java.util.Date;

public class Trying {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.toString());

        Date date1=new Date(12222212121121L);
        System.out.println(date1.toString());

        System.out.println(date1.getTime());

        date.setTime(12222212121L);
        System.out.println(date);
    }
}
