package week_13.assignments;

public class Question_13_14 {
    public static void main(String[] args) {
        Rational rational1=new Rational(5,6);
        Rational rational2=new Rational(1,4);
        Rational add=rational1.add(rational2);
        Rational subtract=rational1.subtract(rational2);
        Rational multiply=rational1.multiply(rational2);
        Rational divide=rational1.divide(rational2);
        System.out.println(rational1+"+"+rational2+"-->"+add);
        System.out.println(rational1+"-"+rational2+"-->"+subtract);
        System.out.println(rational1+"*"+rational2+"-->"+multiply);
        System.out.println(rational1+"/"+rational2+"-->"+divide);
        System.out.println(rational2+"-->"+rational2.doubleValue());
    }
}
