package week_12.assignments;

public class ExeciseEmo {
    public static void main(String[] args) {
        try {
            Triangle triangle=new Triangle(1,2,10);
        }catch (IllegalTriangleException ex){
            System.out.println("Exception block has caught this error!");
        }catch (IllegalArgumentException ex1){
            System.out.println("Illegal triangleException");
        }catch (Exception ex3){
            System.out.println("ex3");
        }

    }
}
