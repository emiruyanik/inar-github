package week_12.assignments;

public class HexFormatException extends NumberFormatException{

    public HexFormatException(){
        super("It is not a hex string");
    }

}
