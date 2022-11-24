package chapter.chapter08.listing;

public class Listing02_GradeExam {
    public static void main(String[] args) {
        char[][] answer = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int row = 0; row < answer.length; row++) {
            int correctCount = 0;
            for (int column = 0; column < answer[row].length; column++) {
                if (answer[row][column] == key[column])
                    correctCount++;
            }
            System.out.println("Student " + row + "'s correct count is " + correctCount);

        }
    }
}
