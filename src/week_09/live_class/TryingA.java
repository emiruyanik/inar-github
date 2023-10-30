package week_09.live_class;

public class TryingA {
    int i = 5;
    static int k = 2;

    public static void main(String[] args) {
        int j = TryingA.k;
        System.out.println(j);
        System.out.println(m2(2, 3));

        System.out.println(TryingA.m2(3, 4));
    }

    public void m1() {
        // Correct since instance and static variables and methods
        // can be used in an instance method
        i = i + k + m2(i, k);
    }

    public static int m2(int i, int j) {
        return (int) (Math.pow(i, j));
    }
}

