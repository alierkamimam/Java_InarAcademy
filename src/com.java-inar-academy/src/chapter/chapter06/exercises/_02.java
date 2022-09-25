package chapter.chapter06.exercises;

public class _02 {
    public static void main(String[] args) {
        System.out.println("birden ona kadar olan sayilerin toplamı "+toplam(1,10));
        System.out.println("total= "+toplam(33,56));
    }
    static int toplam(int say1,int sayı2){
        int toplam=0;
        for (int i=say1;i<=sayı2;i++) {
            toplam += i;
        }
        return toplam;
    }

    }


