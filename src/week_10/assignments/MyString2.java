package week_10.assignments;

public class MyString2 {
    private String str = "";

    public MyString2(String str) {
        this.str = str;
    }

    public int compare(String str) {
        int minIndex = Math.min(str.length(), this.str.length());
        for (int i = 0; i < minIndex; i++) {
            if (this.str.charAt(i) != str.charAt(i)) {
                return ((int) this.str.charAt(i)) - ((int) str.charAt(i));
            }
        }
        return 0;
    }

    public MyString2 subString(int index) {
        StringBuilder str = new StringBuilder();
        for (int i = index; i < this.str.length(); i++) {
            str.append(this.str.charAt(i));
        }
        return new MyString2(str.toString());
    }

    public MyString2 toUpperCase() {
        return new MyString2(this.str.toUpperCase());
    }

    public char[] toChars() {
        char[] chars = new char[this.str.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = this.str.charAt(i);
        }
        return chars;
    }

    public static MyString2 valueOf(boolean check) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(check);
        return new MyString2(stringBuilder.toString());
    }
    @Override
    public String toString(){
        return this.str;
    }
}
