package week_07.assignments;

public class Question_07_24 {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int[] cards = new int[51];

        int necessaryPicks = pickCards(cards, suits, ranks);
        System.out.println("Number of picks:"+necessaryPicks);
    }

    public static int pickCards(int[] cards, String[] suit, String[] ranks) {
        int numberOfpicks = 0;
        int countOfDifferentSuits = 0;
        int[] suits = new int[4];
        while (countOfDifferentSuits < 4) {
            int randomNumber = (int) (Math.random() * 52);
            numberOfpicks++;
            boolean check = true;
            for (int i = 0; i < countOfDifferentSuits; i++) {
                if (randomNumber / 13 == suits[i] / 13) {
                    check = false;
                    break;
                }
            }
            if (check) {
                suits[countOfDifferentSuits] = randomNumber;
                System.out.println(ranks[randomNumber % 13] + " of " + suit[randomNumber / 13]);
                countOfDifferentSuits++;
            }

        }
        return numberOfpicks;

    }


}