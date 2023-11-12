package week_10.assignments;

public class Question_10_22 {
    public static void main(String[] args) {
        MyString1 myString1 = new MyString1(new char[]{'I', 'N', 'A', 'R'});
        System.out.println(myString1);
        MyString1 myString2 = myString1.toLowerCase();
        System.out.println(myString2);
        MyString1 myString3 = myString1.subString(0, 3);
        System.out.println(myString3);
        System.out.println(myString3.length());
        System.out.println(myString1.equals(myString3));
        MyString1 myString4 = new MyString1(new char[]{'I', 'N', 'A', 'R'});
        System.out.println(myString1.equals(myString4));
        System.out.println(MyString1.valueOf(123456));
    }
}
