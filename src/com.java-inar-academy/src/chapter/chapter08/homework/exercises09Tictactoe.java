package chapter.chapter08.homework;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class exercises09Tictactoe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] tictactoe = new int[3][3];
        String[][] display = new String[3][3];
        create(display);
        Print(display);

        while (true) {
            gamerX(display, input);
            if (isValidRow(display) || cross(display) || isValidCol(display)) {
                System.out.println(" The winner is X");
                break;
            }
            if (full(display)) {
                System.out.println("There is no winner:");
            }
            gamerO(display,input);
            if (isValidRow(display) || cross(display) || isValidCol(display)) {
                System.out.println(" The winner is O");
                break;
            }
        }
    }

    public static void Print(String[][] display) {

        for (int row = 0; row < display.length; row++) {
            System.out.println("-------");
            for (int column = 0; column < display[row].length; column++) {
                System.out.print("|" + display[row][column]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void create(String[][] display) {
        for (int ro = 0; ro < display.length; ro++) {
            for (int col = 0; col < display[ro].length; col++) {
                display[ro][col] = " ";
            }

        }
    }

    public static boolean isValidRow(String[][] display) {
        for (int ro = 0; ro < display.length; ro++) {
            int count = 0;
            for (int col = 0; col < display[ro].length - 1; col++) {
                if (display[ro][col] != " ") {
                    if ((display[ro][col] == display[ro][col + 1])) {
                        count++;
                        if (count == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    public static boolean isValidCol(String[][] display) {
        for (int column = 0; column < display[0].length; column++) {
            int count = 0;
            for (int row = 0; row < display.length - 1; row++) {
                if (display[row][column] != " ") {
                    if ((display[row][column] == display[row + 1][column])) {
                        count++;
                        if (count == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean cross(String[][] display) {
        if (display[0][0] != " " && display[0][2] != " ") {
            if ((display[0][0] == display[1][1] && display[1][1] == display[2][2]) ||
                    (display[0][2] == display[1][1] && display[1][1] == display[2][0])) {
                return true;
            }
        }
        return false;
    }

    public static boolean full(String[][] display) {
        for (int ro = 0; ro < display.length; ro++) {
            for (int column = 0; column < display[ro].length; column++) {
                if (display[ro][column] == " ") {
                    return false;
                }
            }
        }
        return true;
    }

    public static void gamerX(String[][] display, Scanner input) {
        System.out.println("Enter a row(0, 1, 2) for players X:");
        int xrow = input.nextInt();
        System.out.println("Enter a column(0, 1, 2) for players X:");
        int xcol = input.nextInt();
        display[xrow][xcol] = "X";
        Print(display);

    }

    public static void gamerO(String[][] display, Scanner input) {
        System.out.println("Enter a row(0, 1, 2) for players O:");
        int Orow = input.nextInt();
        System.out.println("Enter a column(0, 1, 2) for players O:");
        int Ocol = input.nextInt();
        display[Orow][Ocol] = "O";
        Print(display);
    }
}
