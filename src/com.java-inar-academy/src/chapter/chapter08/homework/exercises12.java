package chapter.chapter08.homework;

public class exercises12 {
     static final int SUPPOSE_INCOME=400_000;

    public static void main(String[] args) {
        int[][] brac = brackets();
        double[] rates = rates();

        System.out.print("Single filer\t");
        System.out.print("Married jointly" +
                " -or qualifying widow(er)\t");
        System.out.print("Married separately\t\t\t");
        System.out.print("Head of household\t\n");


        int count = 0;
        while (count < 4) {
            double tax=tax(brac,rates,count);
            System.out.printf("%-25.2f\t\t",tax);
            count++;

        }

    }
    public static double tax(int[][] brac,double[] rates,int count){
        double tax1=0;
        tax1 = brac[count][0] * rates[0] +
                    (brac[count][1]- brac[count][0]) *rates[1] +
                    (brac[count][2] - brac[count][1]) * rates[2] +
                    (brac[count][3] - brac[count][2]) * rates[3] +
                    (brac[count][4] - brac[count][3]) * rates[4] +
                    (SUPPOSE_INCOME-brac[0][4] * rates[5]);
        return tax1;

    }


    public static int[][] brackets(){
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                                                      // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        return brackets;

    }
    public static double[] rates(){
        double[] rate = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        return rate;
    }
    public static void print(double tax){

    }

}
