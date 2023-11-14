package week_10.assignments;

public class MyStringBuilder1 {
    private StringBuilder stringBuilder = new StringBuilder();

    public MyStringBuilder1(String str) {
        this.stringBuilder.append(str);
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        String str1 = s.toString();
        String str2 = this.stringBuilder.toString();

        return new MyStringBuilder1(str1.concat(str2));
    }

    public MyStringBuilder1 append(int i) {
        String str1 = i + "";
        String str2 = this.stringBuilder.toString();

        return new MyStringBuilder1(str1.concat(str2));
    }

    public int length() {
        return this.stringBuilder.length();
    }

    public char charAt(int i) {
        return this.stringBuilder.charAt(i);
    }

    public MyStringBuilder1 toLowerCase() {
        String s1 = this.stringBuilder.toString();
        return new MyStringBuilder1(s1.toLowerCase());
    }

    public MyStringBuilder1 subString(int begin, int end) {
        String str = this.stringBuilder.toString();
        String sub = str.substring(begin, end);
        return new MyStringBuilder1(sub);
    }

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }
}
