package week_13.assignments;

public class Question_13_07 {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        squares[0] = new Square("red", true, 5);
        squares[1] = new Square("red", true, 4);
        squares[2] = new Square("red", true, 4.8);
        squares[3] = new Square("red", true, 7);
        squares[4] = new Square("red", true, 1.3);
        for (int i = 0; i < squares.length ; i++) {
            System.out.println(squares[i]);
            squares[i].howToColour();
            System.out.println("___________________");
        }

    }

    public interface Colourable {
        void howToColour();
    }
}


