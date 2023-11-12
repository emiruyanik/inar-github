package week_10.assignments;

public class Question_10_14 {
    public static void main(String[] args) {
        MyDate myDate=new MyDate();
        System.out.println(myDate.getDay());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getYear());
        MyDate myDate1=new MyDate(34355555133101L);
        System.out.println(myDate1.getDay());
        System.out.println(myDate1.getMonth());
        System.out.println(myDate1.getYear());
        MyDate myDate2=new MyDate(561555550000L );
        System.out.println(myDate2.getDay());
        System.out.println(myDate2.getMonth());
        System.out.println(myDate2.getYear());
    }


}
