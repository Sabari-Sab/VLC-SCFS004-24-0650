package myapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,4,1,2,6);

        System.out.println(nums);

        Stream<Integer> streams = nums.stream().filter(num -> num%2==0);
        List<Integer> even = streams.collect(Collectors.toList());
        System.out.println(even);
        System.out.println("Printing odd numbers");
        nums.stream().filter(num -> num % 2 !=0).forEach(num -> System.out.println(num));
        nums.stream().forEach(System.out::println);
    }

}
