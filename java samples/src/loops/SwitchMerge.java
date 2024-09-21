package loops;

import java.util.Scanner;

public class SwitchMerge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Day Of the Week: ");
        byte b = scan.nextByte();
        switch (b) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;
            case 6:
            case 7:
                System.out.println("Week End");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
        scan.close();
    }
}
