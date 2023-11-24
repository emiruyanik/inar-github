package week_12.assignments;


import java.io.File;
import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\" +
                "week_12\\assignments\\salary.txt");
        Faculty[] faculties = new Faculty[1000];
        for (int i = 0; i < faculties.length; i++) {
            int numb = i + 1;
            String name = "FirstNme" + numb;
            String surName = "Surname" + numb;
            String[] ranks = {"asisstant", "associate", "full"};
            String rank = ranks[(int) (Math.random() * 3)];
            double salary = 0;
            if (rank.equals("asisstant")) {
                salary = (int) (Math.random() * 30000 + 50000);
            } else if (rank.equals("full")) {
                salary = (int) (Math.random() * 60000 + 50000);
            } else {
                salary = (int) (Math.random() * 55000 + 75000);
            }
            faculties[i] = new Faculty(name, surName, rank, salary);
        }
        String lines = "";
        for (int i = 0; i < faculties.length; i++) {
            lines += faculties[i].toString() + "\n";
        }
        PrintWriter output = new PrintWriter(file);
        output.println(lines);
        output.close();
    }
}
