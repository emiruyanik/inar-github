package week_10.assignments;

public class Question_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("La casa de papel");
        System.out.println(myStringBuilder1);

        myStringBuilder1 = myStringBuilder1.append(new MyStringBuilder1("--El Professor"));
        System.out.println(myStringBuilder1);

        myStringBuilder1 = myStringBuilder1.append(434);
        System.out.println(myStringBuilder1);

        System.out.println(myStringBuilder1.length());

        System.out.println(myStringBuilder1.charAt(5));

        myStringBuilder1 = myStringBuilder1.toLowerCase();
        System.out.println(myStringBuilder1);

        myStringBuilder1 = myStringBuilder1.subString(7, 15);
        System.out.println(myStringBuilder1);

        System.out.println(myStringBuilder1.toString());


    }
}
