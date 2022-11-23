package chapter.chapter12.homework.exercises09;

public class BinaryFormatException extends Exception{
    private String binary;

    public BinaryFormatException(String binary) {
        super("Invalid binary value " + binary);
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }
}
