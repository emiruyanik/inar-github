package week_10.assignments;

public class Question_10_23 {
    public static void main(String[] args) {
        MyString2 myString2 = new MyString2("elon musk");
        MyString2 myString2_1 = myString2.toUpperCase();

        System.out.println(myString2_1);

        MyString2 myString2_2 = new MyString2("felon musk");
        System.out.println(myString2.compare(myString2_2.toString()));

        System.out.println(MyString2.valueOf(true));
        System.out.println(MyString2.valueOf(false));

    }
}
