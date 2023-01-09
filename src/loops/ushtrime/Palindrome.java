package loops.ushtrime;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Teksti = ");
        String text = reader.nextLine().toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; isPalindrome && i < text.length() / 2; i++) {
            isPalindrome = text.charAt(i) == text.charAt(text.length() - 1 - i);
        }

        System.out.println(isPalindrome ? "Eshte palindrome" : "Nuk eshte palindrome");
    }
}








