package chapter.chapter12.homework.exercises15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readData {
    public static void main(String[] args) throws Exception {
        File file=new File("exercises12_15.txt");
        Scanner input=new Scanner(file);

        ArrayList<Integer> list=new ArrayList<>();
        while (input.hasNext()){
            Integer number= Integer.valueOf(input.next());
            list.add(number);
        }
        input.close();
        java.util.Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if ((i+1)%10==0){
                System.out.printf("%2d\n",list.get(i));
            }
            System.out.printf("%2d ",list.get(i));

        }



    }
}
