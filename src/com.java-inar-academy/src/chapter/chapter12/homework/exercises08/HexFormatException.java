package chapter.chapter12.homework.exercises08;

public class HexFormatException extends Exception {
    private String hex;

    public HexFormatException(String hex) {
        super("Invalid hex");
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
