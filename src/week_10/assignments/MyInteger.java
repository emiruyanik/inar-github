package week_10.assignments;

public class MyInteger {
    int myInteger;

    MyInteger(int myInteger) {
        this.myInteger = myInteger;
    }

    public int getMyInteger() {
        return myInteger;
    }

    public boolean isEven() {
        return myInteger % 2 == 0;
    }

    public boolean isOdd() {
        return myInteger % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i <= myInteger / 2; i++) {
            if (myInteger % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return MyInteger.isEven(myInteger.getMyInteger());
    }

    public static boolean isOdd(MyInteger myInteger) {
        return MyInteger.isOdd(myInteger.getMyInteger());
    }

    public static boolean isPrime(MyInteger myInteger) {
        return MyInteger.isPrime(myInteger.getMyInteger());
    }

    public boolean isEqual(int value) {
        return myInteger == value;
    }

    public boolean isEqual(MyInteger myInteger) {
        return this.myInteger == myInteger.getMyInteger();
    }

    public static int parseInt(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        String str = stringBuilder.toString();
        int result = Integer.parseInt(str);
        return Integer.parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

}
