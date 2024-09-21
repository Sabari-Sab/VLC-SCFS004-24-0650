package Arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = { 1, 12, 3, 44, 5 };

        // length (instance method)
        System.out.println(numbers.length);

        /* Class methods from java.util.Arrays */

        // sort method
        System.out.println(Arrays.toString(numbers)); // before sort
        Arrays.sort(numbers);
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

    }
}
