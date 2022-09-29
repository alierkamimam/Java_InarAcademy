package chapter.chapter06.listing;

public class listing11 {
    public static void main(String[] args) {


        final int NUMBER_OF_CHAR=175;
        final int CHAR_PER_LİNE=25;


        for(int i=0;i<=NUMBER_OF_CHAR;i++){
            char ch=RandomCharacterlisting10.getRandomLowerCaseLetter();
            if ((i+1)%CHAR_PER_LİNE==0)
               System.out.println(ch);
            else
                System.out.print(ch);
            }
        }
    }

