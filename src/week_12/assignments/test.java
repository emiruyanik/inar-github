package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception{
        File file=new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_12\\assignments\\babynamerankings\\babynameranking2001.txt");
        Scanner input=new Scanner(file);
        String str="";
        while (input.hasNext()){
            str+=input.nextLine()+"\n";
        }
        String[]namesAndRanks=str.split("\n");
        System.out.println(namesAndRanks[999]);

    }
}
