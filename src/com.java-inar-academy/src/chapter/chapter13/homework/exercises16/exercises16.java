package chapter.chapter13.homework.exercises16;

public class exercises16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java String");
            System.exit(1);
        }

        String output = args[0];
        String[] arr = args[0].replaceAll(" ", "/").split("/");

        rational1 num1 = new rational1(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        rational1 num2 = new rational1(Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));

        switch (arr[2]) {
            case "+":
                output += "=" + num1.add(num2);
                break;
            case "-":
                output += "=" + num1.subtract(num2);
                break;
            case "*":
                output += "=" + num1.multiply(num2);
                break;
            case "/":
                output += "=" + num1.divide(num2);
                break;
        }


    }
}
