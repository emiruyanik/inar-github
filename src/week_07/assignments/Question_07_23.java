package week_07.assignments;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        System.out.println(lockers[51]);
        for (int i = 0; i < lockers.length; i++) {
            int numb1 = i + 1;
            for (int j = 0; j < lockers.length; j++) {
                int numb2 = j + 1;
                if (numb2 % numb1 == 0) {
                    if (lockers[j]) {
                        lockers[j] = false;
                    } else {
                        lockers[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
