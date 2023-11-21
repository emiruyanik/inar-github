package week_12.live_class;

public class Trying {
    public static void main(String[] args) {
        try {


            String str=null;

            System.out.println(str.isEmpty());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println(123+258);
        }
        System.out.println("asdasdasd");


    }
}
