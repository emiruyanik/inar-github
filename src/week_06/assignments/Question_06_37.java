package week_06.assignments;

public class Question_06_37 {
    public static void main(String[] args) {

        System.out.println(format(34,2));
    }
    public static String format(int number,int width){
        String numb = number+"";
        String formattedNumb="";

        for (int i = 0; i <width-numb.length() ; i++) {
            formattedNumb+=0;
        }
        return formattedNumb+numb;
    }
}
