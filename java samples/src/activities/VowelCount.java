package activities;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        String quest;
        int vowelCount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String ");
        quest = scan.next();
        System.out.println(quest + " has " + vowelCount + " vowels");
    }
}
