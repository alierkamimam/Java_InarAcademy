package chapter.chapter14.arraylist;

import java.io.File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercises05 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise_20_01 TextFile");
            System.exit(1);
        }

        File file=new File(args[0]);
        if (file.exists()){
            System.out.println("The file "+args[0]+" does not exist.");
            System.exit(2);
        }
        List<String> list=new ArrayList<>();


        try(
            Scanner input=new Scanner(file);
        ){
            while (input.hasNext()){
                String[] s=input.nextLine().split(" ");

                for (int i = 0; i <s.length ; i++) {
                    if (s[i].length()>0 && Character.isLetter(s[i].charAt(0))){
                        list.add(s[i]);
                    }
                }
            }
        }
        Collections.sort(list);

        System.out.println(list);


    }

}

