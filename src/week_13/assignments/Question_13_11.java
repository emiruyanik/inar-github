package week_13.assignments;

public class Question_13_11 {
    public static void main(String[] args) {
        Octagon octagon1=new Octagon("red",true,5);
        System.out.println("area-->" + octagon1.getArea());
        System.out.println("perimeter-->" + octagon1.getPerimeter());
        Octagon octagon2=null;
        try {
            octagon2=(Octagon) octagon1.clone();
        }catch (CloneNotSupportedException ex){
            System.out.println(ex.getMessage());
        }
       int compare=octagon1.compareTo(octagon2);
        if (compare==0){
            System.out.println("Two octagons are equals!");
        }else {
            System.out.println("Two octagons are not equals!");
        }

    }
}
