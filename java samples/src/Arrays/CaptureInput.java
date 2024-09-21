package Arrays;

import java.util.Scanner;

public class CaptureInput {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.print("Enter Name :");
            names[i] = scan.nextLine();
        }
        scan.close();
        for (String string : names) {
            System.out.println(string);
        }
    }
}
