package week_10.assignments;

public class Question_10_01 {
    public static void main(String[] args) {
        Time time=new Time();
        System.out.printf("%d:%d:%d",time.getHour(),time.getMinutes(),time.getSeconds());
        System.out.println();
        Time time1=new Time(555550000);
        System.out.printf("%d:%d:%d",time1.getHour(),time1.getMinutes(),time1.getSeconds());
        System.out.println();
        time1.setTime(1222254544);
        System.out.printf("%d:%d:%d",time1.getHour(),time1.getMinutes(),time1.getSeconds());
    }
}
