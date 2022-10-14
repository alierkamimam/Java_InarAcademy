package chapter.chapter07.homework;

public class exercises23 {
    public static void main(String[] args) {

        boolean[] doors = new boolean[100];
        int numberOfStudents = 100;
        upDateDoors(numberOfStudents, doors);
        displayOpenDoors(doors);

    }

    public static void upDateDoors(int numberOfStudents, boolean[] doors) {
        for (int students = 1; students <= numberOfStudents; students++) {

            for (int doorNum = students - 1; doorNum < doors.length; doorNum += students) {

                if (doors[doorNum]) {
                    doors[doorNum] = false;
                } else
                    doors[doorNum] = true;
            }

        }
    }

    public static void displayOpenDoors(boolean[] doors) {
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                System.out.print((i+1)+" ");
            }

        }


    }
}