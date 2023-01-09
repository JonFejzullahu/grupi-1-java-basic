package loops.ushtrime;

import java.util.Scanner;

public class VerticalText {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Teksti = ");
        String text = reader.nextLine();

        for (
                int i = 0, j = text.length() - 1;
                i < text.length();
                i++, j--
        ) {
            System.out.printf("%5C %10C %n", text.charAt(i), text.charAt(j));
        }

        System.out.println("---------------------------------");
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%5C %10C %n", text.charAt(i), text.charAt(text.length() - 1 - i));
        }
    }
}











