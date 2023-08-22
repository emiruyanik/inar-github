package week_03.assignments;

public class Question_03_24 {
    public static void main(String[] args) {

        int generalCardName = (int) (Math.random() * 4);

        int typeOfCard = (int) (Math.random() * 14);
        switch (typeOfCard) {
            case 0:
                System.out.printf("The card you picked is Ace of ");
                break;
            case 1:
                System.out.printf("The card you picked is 2 of ");
                break;
            case 2:
                System.out.printf("The card you picked is 3 of ");
                break;
            case 3:
                System.out.printf("The card you picked is 4 of ");
                break;
            case 4:
                System.out.printf("The card you picked is 5 of ");
                break;
            case 5:
                System.out.printf("The card you picked is 6 of ");
                break;
            case 6:
                System.out.printf("The card you picked is 7 of ");
                break;
            case 7:
                System.out.printf("The card you picked is 8 of ");
                break;
            case 8:
                System.out.printf("The card you picked is 9 of ");
                break;
            case 9:
                System.out.printf("The card you picked is 10 of ");
                break;
            case 10:
                System.out.printf("The card you picked is Jack of ");
                break;
            case 11:
                System.out.printf("The card you picked is Queen of ");
                break;
            case 12:
                System.out.printf("The card you picked is King of ");
                break;


        }

        switch (generalCardName) {
            case 0:
                System.out.printf(" Clubs  ");
                break;
            case 1:
                System.out.printf(" Diamonds  ");
                break;
            case 2:
                System.out.printf(" Hearts  ");
                break;
            case 3:
                System.out.printf(" Spades  ");
                break;
        }

    }
}
