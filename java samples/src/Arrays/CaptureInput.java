package Arrays;

import java.util.Scanner;

public class CaptureInput {
    public static void main(String[] args) {
        String[] names = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name :");
        names[0] = scan.nextLine();

        scan.close();
    }
}
