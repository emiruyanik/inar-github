package week_06.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s","p","2^p-1\n");
        System.out.printf("%s\n","_________________");
        mersennePrime(31);
    }
    public static void mersennePrime(int number){
        int init =2;
        while (init<=number){
            long powNumber=formulaOfMersennePrime(init);
            if (isPrime(powNumber)){
                System.out.printf("%-10d %-10d\n",init,powNumber);
            }
            init++;
        }
    }
    public static long formulaOfMersennePrime(int init){
        return (long) (Math.pow(2,init))-1;
    }
    public static boolean isPrime(long numb) {
        boolean result = true;
        for (int i = 2; i <= numb / 2; i++) {
            if (numb % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
