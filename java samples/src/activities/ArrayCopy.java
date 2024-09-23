package activities;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = Arrays.copyOf(a, 10);
        for (int i = 5; i < b.length; i++) {
            b[i] = i + 1;
        }
        System.out.println(Arrays.toString(b));
    }
}
