package selection_decision;

import java.util.Scanner;

public class DetyraFlipCoin {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjidh njeren (true-Heads, false-Tails):");
        boolean zgjedhja = reader.nextBoolean();
        boolean rezultati = Math.random() < 0.5;
        // nese eshte me i vogel  se 0.5 eshte Heads
        // perndryshe eshte Tails
        if (zgjedhja == rezultati)
            System.out.println("Urime");
        else System.out.println("Deshtime");

        System.out.println(zgjedhja == rezultati ? "Urime" : "Deshtime");
    }
}






