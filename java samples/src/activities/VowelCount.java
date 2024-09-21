package activities;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        String quest;
        int vowelCount = 0; // variable to hold the vowel count
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String ");
        quest = scan.next();

        // convert the string to lower case and then to a char array
        char[] temp = quest.toLowerCase().toCharArray();

        // looping to find the vowels
        for (char c : temp) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowelCount++; // increment the variable when a vowel is found
        }

        System.out.println(quest + " has " + vowelCount + " vowels"); // print the final vowel count
        scan.close();
    }
}
