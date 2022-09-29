package chapter.chapter06.homework;

public class exercises01 {
    public static void main(String[] args) {
        final int NUMBER=100;
        final int LİNE=10;

        int count=1;
        for(int i=1;i<=NUMBER;i++){
            if (count%10==0){
                System.out.printf("%7d\n",getPentoganaNumber(i));
            }else
                System.out.printf("%7d",getPentoganaNumber(i));
            count++;
        }


    }
    public static int getPentoganaNumber(int n){
        int formula=n*(3*n-1)/2;
        return formula;
    }
}
