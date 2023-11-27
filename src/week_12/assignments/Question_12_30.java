package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year:");
        String year = input.nextLine();

        System.out.print("Enter the gender:");
        String gender = input.nextLine();
        gender = gender.toUpperCase();

        System.out.print("Enter the name:");
        String name = input.nextLine();

        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_12\\" +
                "assignments\\babynamerankings\\babynameranking" + year + ".txt");
        if (isExistsName(name, file) && (gender.equals("M") || gender.equals("F"))) {
            String rank = findTheRank(file, gender, name);
            System.out.println("The name is ranked-->" + rank);
        } else {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }

    }

    private static String findTheRank(File file, String gender, String name) {
        Scanner input = null;
        String result = "";
        try {
            input = new Scanner(file);
            String lines = "";
            while (input.hasNext()) {
                lines += input.nextLine() + "\n";
                String[] namesAndRanks = lines.split("\n");
                String[][] doubleArrayNamesAndRanks = doubleArrayNamesAndRanks(namesAndRanks);
                for (int i = 0; i < doubleArrayNamesAndRanks.length; i++) {
                    if (gender.equalsIgnoreCase("M")) {
                        if (doubleArrayNamesAndRanks[i][1].equalsIgnoreCase(name)) {
                            result = (i + 1) + "";
                        }
                    } else {
                        if (doubleArrayNamesAndRanks[i][2].equalsIgnoreCase(name)) {
                            result = (i + 1) + "";
                        }
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    private static String[][] doubleArrayNamesAndRanks(String[] namesAndRanks) {
        String[][] result = new String[namesAndRanks.length][3];
        for (int i = 0; i < namesAndRanks.length; i++) {
            String str = namesAndRanks[i];
            String[] datas = str.split("[\\s]+");
            result[i][0] = datas[0];
            result[i][1] = datas[1];
            result[i][2] = datas[2];

        }
        return result;
    }

    public static boolean isExistsName(String name, File file) {
        Scanner input = null;
        try {
            input = new Scanner(file);
            String lines = "";
            while (input.hasNext()) {
                lines += input.nextLine() + "\n";
                String[] namesAndRank = lines.split("[\\n\\s]+");
                for (String s : namesAndRank) {
                    if (name.equalsIgnoreCase(s)) {
                        return true;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }


}
