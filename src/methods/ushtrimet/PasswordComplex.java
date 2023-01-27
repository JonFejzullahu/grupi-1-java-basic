package methods.ushtrimet;

import java.util.Scanner;

public class PasswordComplex {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj passwordin (plaintext): ");
        String password = reader.nextLine();

        System.out.println(isValidPassword(password));

    }

    //REGEX - Regular Expression
    // [a-zA-Z0-9]{10,}
    public static boolean isValidPassword(String password) {
        return hasTenCharsInPassword(password) && !hasSymbol(password)
                && hasAtLeastTwoNumbers(password);
    }

    public static boolean hasTenCharsInPassword(String password) {
        return password.length() >= 10;
    }

    // A
    public static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isNotNumberOrLetter(char c) {
        return !isNumber(c) && !isLetter(c);
    }

    public static boolean hasSymbol(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isNotNumberOrLetter(c)) return true;
        }
        return false;
    }

    public static boolean hasAtLeastTwoNumbers(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isNumber(c)) counter++;
        }
        return counter >= 2;
    }


}








