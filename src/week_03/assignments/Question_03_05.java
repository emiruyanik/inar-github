package week_03.assignments;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day :for sunday o for monday 1 ... for saturday 6");
        int currentDay = input.nextInt();
        if (!(currentDay>=0 && currentDay<=6)){
            System.out.println("İnvalid value please enter the correct number");
            System.exit(1);
        }

        System.out.println("Enter the number of days elapsed since today");
        int elapsedDay = input.nextInt();

            switch ((currentDay + elapsedDay) % 7) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 0:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Error : invalid status");
                    System.exit(1);


            }
        }
    }
