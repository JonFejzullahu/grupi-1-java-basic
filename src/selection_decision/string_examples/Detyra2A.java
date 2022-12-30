package selection_decision.string_examples;

import java.util.Scanner;

public class Detyra2A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruani gjatesine e drejtekendeshit: ");
        int gjatesia = Integer.valueOf(reader.nextLine());
        System.out.println("Shkruani gjeresine e drejtekendeshit: ");
        int gjeresia = Integer.valueOf(reader.nextLine());

        if (gjatesia == gjeresia) {
            System.out.println("Eshte katror");
        } else {
            System.out.println("Nuk eshte katror");
        }

        System.out.println(gjatesia == gjeresia ? "eshte katror" : "nuk eshte katror");
    }
}




