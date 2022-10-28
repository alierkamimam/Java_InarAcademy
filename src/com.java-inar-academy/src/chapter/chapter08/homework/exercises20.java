
package chapter.chapter08.homework;

import javax.print.DocFlavor;
import java.util.Scanner;


public class exercises20 {
    static Scanner input = new Scanner(System.in);
    final static int row = 6;
    final static int column = 7;
    static int[][] board = new int[row][column];
    static boolean isRedTurn = true;

    public static void main(String[] args) {
        print1(board);
        while (!gameower()) {
            isRedTurn = !isRedTurn;
            askQuestion();
            int entrynumber = input.nextInt();
            if (!isValid(entrynumber)) {
                isRedTurn = !isRedTurn;
                System.out.println("Invalid entry:");
                //continue;
            }
            placeEntry(entrynumber);
            print1(board);


        }
    }

    private static boolean gameower() {
        if (sameRow() || sameCol() || rightDiagonal() || leftDiagonal()) {
            System.out.printf("Congratulation!!!\n%s WINS", isRedTurn ? "RED" : "YELLOW");
            return true;
        } else if (isTheBoardFull()) {
            System.out.println("Game is over!It's a draw");
            return true;
        } else {
            return false;
        }
    }

    private static boolean leftDiagonal() {
        int num = isRedTurn ? 1 : 2;
        for (int i = 0; i < row - 3; i++) {
            for (int j = 3; j < column; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j - k] == num) {
                        count++;
                    } else {
                        count = 0;
                    }
                    if (count >= 4) {
                        System.out.println("LEFT DIAOGAL");
                        return true;
                    }
                }

            }
        }
        return false;


    }

    private static boolean rightDiagonal() {
        int num = isRedTurn ? 1 : 2;
        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < column - 3; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j + k] == num) {
                        count++;

                    } else {
                        count = 0;
                    }
                    if (count >= 4) {
                        System.out.print("RIGHT DIAOGAL!!");
                        return true;
                    }

                }

            }
        }
        return false;

    }

    private static boolean sameCol() {
        int num = isRedTurn ? 1 : 2;
        for (int i = 0; i < column; i++) {
            int count = 0;
            for (int j = 0; j < row; j++) {
                if (board[j][i] == num) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 4) {
                    System.out.print("SAME COLUMN!!");
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean sameRow() {
        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < column; j++) {
                if (board[i][j] == num) {
                    count++;
                } else {
                    count = 0;

                }

                if (count >= 4) {
                    System.out.print("SAME ROW!!");
                    return true;
                }

            }

        }
        return false;
    }

    private static boolean isTheBoardFull() {
        for (int i = 0; i < row; i++) {
            if (board[0][i] == 0) {
                return false;

            }
        }
        return true;
    }

    private static void print1(int[][] board) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("| ");
                if (board[i][j] == 1) {
                    System.out.print("R");
                } else if (board[i][j] == 2) {
                    System.out.print("Y");
                } else
                    System.out.print(" ");
            }
            System.out.print("");
            System.out.print("|\n");
        }
        System.out.println("----------------------");


    }

    public static void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("| ");
            }
            System.out.print("|\n------------");

        }


    }

    private static void placeEntry(int entrynumber) {
        for (int i = 1; i < row; i++) {
            if (board[i][entrynumber] != 0) {
                board[i - 1][entrynumber] = isRedTurn ? 1 : 2;
                return;


            }
        }
        board[row - 1][entrynumber] = isRedTurn ? 1 : 2;


    }

    private static boolean isValid(int entrynumber) {
        if (entrynumber < 0 || entrynumber > 3) {
            return false;
        }
        if (isTheColFull(entrynumber)) {
            return false;
        }
        return true;
    }

    private static boolean isTheColFull(int entrynumber) {
        return board[0][entrynumber] != 0;


    }

    private static void askQuestion() {
        String color = isRedTurn ? "R" : "Y";
        System.out.printf("Drop a %s disk at column (0-6):", color);
    }


}



