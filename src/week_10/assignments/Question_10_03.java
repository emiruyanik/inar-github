package week_10.assignments;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(41614161);
        System.out.println("getValue():" + myInteger.getMyInteger());
        System.out.println("isEven():" + myInteger.isEven());
        System.out.println("isOdd():" + myInteger.isOdd());
        System.out.println("isPrime():" + myInteger.isPrime());
        System.out.println("isEqual():" + myInteger.isEqual(2));
        System.out.println("isEqual():" + myInteger.isEqual(new MyInteger(41614161)));
        System.out.println("isEven():" + MyInteger.isEven(41614161));
        System.out.println("isOdd():" + MyInteger.isOdd(41614161));
        System.out.println("isPrime():" + MyInteger.isPrime(41614161));
        char[] ch = new char[]{'1', '2', '3'};
        System.out.println(MyInteger.parseInt(ch));
        System.out.println(MyInteger.parseInt("123"));
    }

}
