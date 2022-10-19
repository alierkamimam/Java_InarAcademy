package chapter.chapter08.homework;

public class exercises03 {
    public static void main(String[] args) {
        char[][] answer = answer();
        char[] key = key();
        int[] count = new int[8];
        int[] index = new int[8];
        check(answer, key, count, index);
        display(count, index);


    }

    public static char[][] answer() {
        char[][] answer = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        return answer;

    }

    public static char[] key() {
        char[] key =  {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        return key;
    }

    public static void check(char[][] answer, char[] key, int[] count, int[] index) {
        for (int row = 0; row < answer.length; row++) {
            int correctCount = 0;
            for (int column = 0; column < answer[row].length; column++) {
                if (answer[row][column] == key[column]) {
                    correctCount++;
                }

            }
            count[row] = correctCount;
            index[row] = row;
        }

        for (int row = 0; row < count.length - 1; row++) {

            int currentMin = count[row];

            int currentMinIndex = row;

            for (int column = row + 1; column < count.length; column++) {
                if (currentMin > count[column]) {
                    currentMin = count[column];
                    currentMinIndex = column;
                }
            }
            if (currentMinIndex != row) {
                count[currentMinIndex] = count[row];
                count[row] = currentMin;


                int temp = index[currentMinIndex];
                index[currentMinIndex] = index[row];
                index[row] = temp;


            }

        }
    }

    public static void display(int[] count, int[] index) {
        for (int i = 0; i < count.length; i++) {
            System.out.println("Student " + index[i] + "'s correct count is " + count[i]);
        }

    }

}

