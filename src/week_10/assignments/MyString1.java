package week_10.assignments;

public class MyString1 {
    private String str="";

    public MyString1(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            this.str += chars[i];
        }
    }

    public char charAt(int index) {
        return this.str.charAt(index);
    }

    public int length() {
        return this.str.length();
    }

    public MyString1 subString(int begin, int end) {
        char[] chars = new char[end - begin];
        int counter = 0;
        for (int i = begin; i < end - begin; i++) {
            chars[counter] = this.str.charAt(i);
            counter++;
        }
        return new MyString1(chars);
    }

    public MyString1 toLowerCase() {
        char[] chars = new char[this.str.length()];
        for (int i = 0; i < this.str.length(); i++) {
            chars[i] = this.str.toLowerCase().charAt(i);
        }
        return new MyString1(chars);
    }

    public boolean equals(MyString1 myString1) {
        if (myString1.length() != this.str.length()) {
            return false;
        }
        for (int i = 0; i < this.str.length(); i++) {
            if (this.str.charAt(i) != myString1.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int value) {
        String charOfValues = value + "";
        char[] chars = new char[charOfValues.length()];
        for (int i = 0; i < charOfValues.length(); i++) {
            chars[i] = charOfValues.charAt(i);
        }
        return new MyString1(chars);
    }
    @Override
   public String toString(){
        return this.str;
   }
}
