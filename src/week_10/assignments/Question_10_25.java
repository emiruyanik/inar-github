package week_10.assignments;

public class Question_10_25 {
    public static void main(String[] args) {
        String emir = "abd#f#cd#ghd";
        String[] arr = splits(emir, "#");
        for (String s : arr) {
            System.out.println(s);
        }

    }

    public static String[] splits(String s, String regex) {
        String[] splitOfS = s.split(regex);
        String[] result = new String[splitOfS.length + (splitOfS.length - 1)];
        String lastString = splitOfS[splitOfS.length - 1];

        int j = 1;
        for (int i = 0; i < splitOfS.length - 1; i++) {
            result[2 * i] = splitOfS[i];
            result[j] = regex;
            j = j + 2;
        }
        result[result.length - 1] = lastString;
        return result;
    }
}
