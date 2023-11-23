package week_12.assignments;

public class BinaryFormatException extends Exception{
    public BinaryFormatException(){
        super("It's not a binary string!");
    }
    public BinaryFormatException(String value){
        super(value+" is not a binary format");
    }
}
