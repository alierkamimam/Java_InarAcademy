package chapter.chapter11.checkpoint;

import java.util.ArrayList;

public class cp31 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
        //list.add(java.util.Date); error
        String city=list.get(0);
        System.out.println(city);
        list.set(1,"Dallas");
    }
}
