package week_05.assignments;

public class Question_05_10 {
    public static void main(String[] args) {
        String numbers = "";
        int counter = 0;

        for (int i = 100; i < 1001; i++) {
            if (i % 5 == 0 && i%6==0){
                numbers=numbers+i+" ";
                counter++;
                if (counter%10==0){
                    numbers=numbers+"\n";
                }
            }
        }
        System.out.println(numbers);
    }
}
