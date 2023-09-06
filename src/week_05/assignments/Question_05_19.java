package week_05.assignments;

public class Question_05_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8 - i; j++) {

                System.out.printf("%-2s  ","");

            }

            for (int j = 0; j < i; j++) {
                System.out.printf("%.0f%s  ", Math.pow(2, j)," ");


            }

            for (int j = 2; j <=i ; j++) {
                System.out.printf("%.0f%s",Math.pow(2,i-j),"    ");
                
            }
            
            System.out.println();
        }
    }
}
