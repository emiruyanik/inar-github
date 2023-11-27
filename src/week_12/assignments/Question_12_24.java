package week_12.assignments;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) throws Exception {
        File salary = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\" +
                "week_12\\assignments\\salary.txt");

        Scanner input = new Scanner(salary);

        ArrayList<Double> salaryForAssistants = new ArrayList<>();
        ArrayList<Double> salaryForAssociate = new ArrayList<>();
        ArrayList<Double> salaryForFull = new ArrayList<>();
        while (input.hasNext()) {
            String line = input.nextLine();
            if (line.contains("asisstant")) {
                int beginIndex = line.lastIndexOf(" ") + 1;
                int endIndex = line.length();
                Double payment = Double.parseDouble(line.substring(beginIndex, endIndex));
                salaryForAssistants.add(payment);

            } else if (line.contains("full")) {
                int beginIndex = line.lastIndexOf(" ") + 1;
                int endIndex = line.length();
                Double payment = Double.parseDouble(line.substring(beginIndex, endIndex));
                salaryForFull.add(payment);
            } else {
                int beginIndex = line.lastIndexOf(" ") + 1;
                int endIndex = line.length();
                Double payment = Double.parseDouble(line.substring(beginIndex, endIndex));
                salaryForAssociate.add(payment);
            }
        }
        BigDecimal totalForAssistants = BigDecimal.valueOf(AddAllOfThem(salaryForAssistants));
        BigDecimal totalForFulls = BigDecimal.valueOf(AddAllOfThem(salaryForFull));
        BigDecimal totalForAssociates = BigDecimal.valueOf(AddAllOfThem(salaryForAssociate));

        System.out.println("Total salary for Assistants-->" + totalForAssistants);

        System.out.println("Total salary for Fulls-->" + totalForFulls);

        System.out.println("Total salary for Associates-->" + totalForAssociates);

        BigDecimal totalFaculty = new BigDecimal(0);
        totalFaculty = totalFaculty.add(totalForAssistants).add(totalForFulls).add(totalForAssociates);
        System.out.println("Total salary for full faculty-->" + totalFaculty);
        System.out.println("__________________________________________________________");

        System.out.println("Average salary for Assistants-->" +
                totalForAssistants.divide(new BigDecimal(salaryForAssistants.size()), 2, RoundingMode.CEILING));

        System.out.println("Average salary for Fulls-->" +
                totalForFulls.divide(new BigDecimal(salaryForFull.size()), 2, RoundingMode.CEILING));

        System.out.println("Average salary for Associates-->" +
                totalForAssociates.divide(new BigDecimal(salaryForAssociate.size()), 2, RoundingMode.CEILING));
        System.out.println("Average salary for full faculty-->" +
                totalFaculty.divide(new BigDecimal(salaryForAssistants.size() +
                        salaryForFull.size() + salaryForAssociate.size()), 2, RoundingMode.CEILING));
    }

    public static double AddAllOfThem(ArrayList<Double> salaryForSome) {
        double result = 0;
        for (Double aDouble : salaryForSome) {
            result += aDouble;
        }
        return result;
    }
}
