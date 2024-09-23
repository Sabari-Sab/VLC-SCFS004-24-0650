package activities;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputChoice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int n = scanner.nextInt();
        int addMore = 0;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Do you want to add Elements? (0/1): ");
            addMore = scanner.nextInt();
            if (addMore == 0) {
                break;
            }
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("The final array is: " + Arrays.toString(array));

        scanner.close();
    }

}
