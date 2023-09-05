package week_05.assignments;

public class Question_05_15 {
    public static void main(String[] args) {

        String chars = "";
        int counter = 0;
        int valueOfCh = 33;


        while (valueOfCh<127){


            char ch =(char) valueOfCh;
            chars = chars+ch+" ";
            valueOfCh++;
            counter++;

            if (counter%10==0){
                chars=chars+"\n";
            }

        }
        System.out.println(chars);
    }
}
