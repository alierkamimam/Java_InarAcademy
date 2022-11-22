package chapter.chapter12.exercises;

import java.net.MalformedURLException;
import java.net.URL;

public class ex03 {
    public static void main(String[] args) {
        try {
            URL url = new URL("www.google.com/index.html");
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }
}
