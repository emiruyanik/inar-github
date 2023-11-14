package week_10.assignments;

public class MyStringBuilder2 {
    StringBuilder stringBuilder = new StringBuilder();

    public MyStringBuilder2() {

    }

    public MyStringBuilder2(char[] chars) {
        for (char aChar : chars) {
            this.stringBuilder.append(aChar);
        }
    }

    public MyStringBuilder2(String str) {
        this.stringBuilder.append(str);
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        StringBuilder result = new StringBuilder(this.stringBuilder.toString());
        result.insert(offset, s.toString());

        return new MyStringBuilder2(result.toString());

    }

    public MyStringBuilder2 reverse() {
        StringBuilder result = this.stringBuilder.reverse();
        return new MyStringBuilder2(result.toString());
    }

    public MyStringBuilder2 subString(int begin) {
        return new MyStringBuilder2(this.stringBuilder.substring(begin));
    }

    public MyStringBuilder2 toUpperCase() {
        String str = this.stringBuilder.toString();
        str = str.toUpperCase();

        return new MyStringBuilder2(str);
    }

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }
}
