package methods.ushtrimet;

import java.util.Scanner;

public class DetyraVowels {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sheno tekstin: ");
        String text = reader.nextLine();
        int index = 0;
        int counter = 0;
        do {
            char shkronja = text.charAt(index);
            if (isVowel(shkronja))
                counter++;
            index++;
        } while (index < text.length());

        System.out.println(counter);
    }

    public static boolean isVowel(char karakteri) {
        return "AEIOUYaeiouy".contains(karakteri + "");
    }
}





























