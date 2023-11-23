package week_12.live_class;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperty("user.dir"));
        File file = new File(System.getProperty("user.dir") +
                "/inar-java/src/week_12/live_class/A Tale of Two cities.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        File file1=new File(file.getParent()+"/newText");
       try (
               PrintWriter output = new PrintWriter(file1);


               Scanner input=new Scanner(file);

            ){
           while (input.hasNext()){
               String line=input.nextLine();
               output.println(line);
           }
       }







        }

    }


