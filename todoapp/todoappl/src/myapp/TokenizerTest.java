package myapp;

import java.util.stream.Stream;

public class TokenizerTest {

    public static void main(String[] args) {
        String text = "Java is fun,easy to learn.\nPython is fun and used popularly for ML.";
        String[] arr = text.split("[ , ]");
        System.out.println("--------------------");
        System.out.println(arr.length);
        for(String str : arr){
            System.out.println(str);
        }
        Stream<String> words = text.lines();
        words.forEach(System.out::println);
    }

}
