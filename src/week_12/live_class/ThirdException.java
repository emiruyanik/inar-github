package week_12.live_class;

public class ThirdException {
    public static void main(String[] args) {

        try {
            String str = null;
            int x = str.length();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}