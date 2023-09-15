package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {

        double firstStage = 5000 * 0.08;
        double secondStage = 5000 * 0.10;
        double baseSalary = 5000;
        double target = 30000;
        double remainingAmountToTarget = target - baseSalary - firstStage - secondStage;

        double necessaryAmount = 10000;
        double account = 0;
        do {
            necessaryAmount+=0.01;
            account = necessaryAmount * 0.12;

        } while (remainingAmountToTarget >= account);

        System.out.println(necessaryAmount + 10000);
    }
}
