package chapter.chapter06.homework;

import chapter.chapter06.listing.RandomCharacterlisting10;

public class exercises38 {
    public static void main(String[] args) {
        System.out.println("------------------------");

        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0){
                System.out.print("|");
        }
            if ((i+1)%10==0){
                System.out.println(RandomCharacterlisting10.getGetRandomUpperCaseLetter()+"|");
            }else
                System.out.print(RandomCharacterlisting10.getGetRandomUpperCaseLetter()+"");

            }
        System.out.println("----------------------");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println(RandomCharacterlisting10.getRandomDigitCharacter() + "|");
            } else {
                System.out.print(RandomCharacterlisting10.getRandomDigitCharacter() + " ");
            }
        }
        System.out.println("----------------------");

    }


}
