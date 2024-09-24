package arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = { 1, 12, 3, 44, 5 };

        // length (instance method)
        System.out.println(numbers.length);

        /* Class methods from java.util.Arrays */

        // sort method
        System.out.println(Arrays.toString(numbers)); // before sort
        Arrays.sort(numbers); // permanently sorts the contents of the array
        System.out.println(Arrays.toString(numbers)); // after sort

        // binary search
        int[] testSort = { 1, 12, 3, 44, 5 };
        Arrays.sort(testSort);
        int res = Arrays.binarySearch(testSort, 12); // sort the array before using the binary search
        System.out.println(res);

        // fill method
        int[] nums = new int[5];
        Arrays.fill(nums, 5);
        System.out.println(Arrays.toString(nums)); // after fill

        // copy arrays
        int[] copy = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(copy));

        // compare arrays
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 1, 2, 3 };
        System.out.println(Arrays.equals(a1, a2));
        int[][] b1 = { { 1, 2 }, { 3, 4 } };
        int[][] b2 = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.deepEquals(b1, b2));

        // stream API
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

    }
}
