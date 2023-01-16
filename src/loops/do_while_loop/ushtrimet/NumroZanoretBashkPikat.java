package loops.do_while_loop.ushtrimet;

import java.util.Scanner;

public class NumroZanoretBashkPikat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine().toUpperCase();

        int counterVowels = 0;
        int counterConsonant = 0;
        int counterSymbols = 0;

        int index = 0;

        do {
            char shkronja = text.charAt(index); // e murrem Mitrovicen

            if (shkronja >= 'A' && shkronja <= 'Z') {
                //if (shkronja=='A' || shkronja == 'E' ...)
                if ("AEIOUY".contains(shkronja + "")) counterVowels++;
                else counterConsonant++;

            } else {
                if ("!?.:;,".contains(shkronja + "")) counterSymbols++;
            }

            index++;
        } while (index < text.length());

        System.out.println("----------------------------------------");
        System.out.printf("Zanore:                           %5d%n", counterVowels);
        System.out.printf("Bashketingellore:                 %5d%n", counterConsonant);
        System.out.printf("Shenja te pikesimit:              %5d%n", counterSymbols);
        System.out.println("----------------------------------------");
    }
}








