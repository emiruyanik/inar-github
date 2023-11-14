package week_10.assignments;

public class Question_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2("1903");
        myStringBuilder2 = myStringBuilder2.insert(2, new MyStringBuilder2("Beşiktaş"));
        System.out.println(myStringBuilder2);

        myStringBuilder2 = myStringBuilder2.reverse();
        System.out.println(myStringBuilder2);

        myStringBuilder2 = myStringBuilder2.subString(10);
        System.out.println(myStringBuilder2);

        myStringBuilder2 = myStringBuilder2.reverse();
        System.out.println(myStringBuilder2);
    }
}
