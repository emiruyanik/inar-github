package week_11.assignments;

import week_10.assignments.Circle2D;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objectArrayList = new ArrayList<>();

        Loan loan = new Loan(2.5, 1, 1000);

        Date date= new Date();

        String str=("Inar Academy");


        Circle2D circle2D=new Circle2D(2,2,2);

        objectArrayList.add(loan);
        objectArrayList.add(date);
        objectArrayList.add(str);
        objectArrayList.add(circle2D);

        for (Object o : objectArrayList) {
            System.out.println(o.toString());

        }


    }
}
