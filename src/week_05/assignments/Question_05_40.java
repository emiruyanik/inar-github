package week_05.assignments;

public class Question_05_40 {
    public static void main(String[] args) {

        System.out.println("Flipping a coin one million times");
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000000; i++) {
            int randomFlippingNumber = (int) (Math.random() * 2);

            if (randomFlippingNumber == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads :" + heads);
        System.out.println("Tails :" + tails);
    }
}
