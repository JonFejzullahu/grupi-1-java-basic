package selection_decision.string_examples;

import java.util.Scanner;

public class StringAssignment1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine();

        System.out.println("Teksti i dhene gjithsej ka: " + text.length() + " karaktere!");
        System.out.printf("Shkruaj nje indeks nga 0 deri me %d: ", text.length() - 1);
        int index1 = Integer.parseInt(reader.nextLine()); // reader.nextInt();
        System.out.println(text.substring(index1));
        System.out.printf("Shkruaj indeksin e fillimit nga 0 deri me %d: ", text.length() - 1);
        int startIndex = Integer.parseInt(reader.nextLine());
        System.out.printf("Shkruaj indeksin e mbarimit nga %d deri me %d: ",
                startIndex, text.length() - 1);
        int endIndex = Integer.parseInt(reader.nextLine());

        System.out.println(text.substring(startIndex, endIndex));

    }
}






