package chapter.chapter09.homework;

public class Exercises11 {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(9, 4, 3, -5, -6, -21);
        LinearEquation linearEquation1 = new LinearEquation(1, 2, 3, 4, 5, 6);

        display(linearEquation);

        System.out.println("------------------");

        display(linearEquation1);


    }

    public static void display(LinearEquation linearEquation) {
        if (linearEquation.isSolved()) {
            System.out.println("Equation " + " x -->" + linearEquation.getX() + " y --> " + linearEquation.getY());
        } else
            System.out.println("The equation has no solution");
    }
}
