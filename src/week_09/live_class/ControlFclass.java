package week_09.live_class;

public class ControlFclass {
    public static void main(String[] args) {
        F f = new F();
        System.out.println(f.i);
        System.out.println(F.s);
       // f.iMethod();
        f.sMethod();
     //   System.out.println(ClassF.i);
        System.out.println(F.s);
       // ClassF.iMethod;
        F.sMethod();

        f.p();
    }
}
