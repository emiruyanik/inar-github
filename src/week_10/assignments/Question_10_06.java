package week_10.assignments;

public class Question_10_06 {
    public static void main(String[] args) {
        int numb = 0;
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            if (MyInteger.isPrime(i)) {
                stackOfIntegers.push(i);
            }

        }
        int loopNumber=stackOfIntegers.getSize();
        for (int i = 0; i < loopNumber ; i++) {

            System.out.print(stackOfIntegers.pop()+" ");
        }
    }
}
