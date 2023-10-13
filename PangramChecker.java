package HEMANTH_PROEJECTS;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String input) {
        
        input = input.toLowerCase();

        
        boolean[] alphabet = new boolean[26];

       
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; // If any letter is not present, it's not a pangram
            }
        }

        return true; // All letters from A to Z are present, so it's a pangram
    }
}
 

