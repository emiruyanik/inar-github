package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) throws  Exception{
        Scanner input=new Scanner(System.in);
        System.out.print("Enter directory name:");
        String directoryName=input.nextLine();
        File file =new File(directoryName);

        boolean check=file.mkdir();
        if (check){
            System.out.println("Directory created successfully");
        }else {
            System.out.println("Directory already exists:");
        }

    }
}
