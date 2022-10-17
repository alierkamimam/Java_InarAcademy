package chapter.chapter08.execises;

public class _01 {
    public static void main(String[] args) {
        int[][] matrix=new int[3][5];
        matrix[2][1]=7;
        matrix[2][4]=5;
        methods.print(matrix);

        int[][] twoD = new int[3][];
        twoD[0]=new int[4];
        twoD[1]=new int[4];
        twoD[2]=new int[4];

        System.out.println("------------");
        int[][] triangleArray = new int[5][];
        triangleArray[0] = new int[5];
        triangleArray[1] = new int[4];
        triangleArray[2] = new int[3];
        triangleArray[3] = new int[2];
        triangleArray[4] = new int[1];
        triangleArray[0][3] = 50;
        triangleArray[4][0] = 45;


        methods.print(triangleArray);


    }

}
