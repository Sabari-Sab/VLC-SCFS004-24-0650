package myapp;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        
        String words[] = new String[10];
        words[0] = "Ball";

        Optional<String> opt = Optional.of(words[0]);
        Optional<String> opt1 = Optional.ofNullable(words[1]);

        System.out.println(opt);
        System.out.println(opt1);
    }

}
