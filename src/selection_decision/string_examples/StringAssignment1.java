package selection_decision.string_examples;

import java.util.Scanner;

public class StringAssignment1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine();
        //kerkesa 1
        System.out.println("Teksti i dhene gjithsej ka: " + text.length() + " karaktere!");
        //kerkesa 2
        System.out.printf("Shkruaj nje indeks nga 0 deri me %d: ", text.length() - 1);
        int index1 = Integer.parseInt(reader.nextLine()); // reader.nextInt();
        System.out.println(text.substring(index1));
        //kerkesa 3
        System.out.printf("Shkruaj indeksin e fillimit nga 0 deri me %d: ", text.length() - 1);
        int startIndex = Integer.parseInt(reader.nextLine());
        System.out.printf("Shkruaj indeksin e mbarimit nga %d deri me %d: ",
                startIndex, text.length() - 1);
        int endIndex = Integer.parseInt(reader.nextLine());

        if (startIndex >= 0 && startIndex < endIndex && endIndex < text.length())
            System.out.println(text.substring(startIndex, endIndex));
        else
            System.out.println("Indeksat nuk jane ne rregull!");


        System.out.println("Shkruaj tekstin qe po kerkoni: ");
        String searchText = reader.nextLine();

        if (text.contains(searchText)) {
            System.out.println("Teksti i dhene gjendet, dhe fillon nga indeksi "
                    + text.indexOf(searchText));
        } else {
            System.out.println("Teksti i dhene nuk gjendet!");
        }

        System.out.println("Shkruaj fjalen qe po kerkoni me zavendesu: ");
        String oldText = reader.nextLine();
        System.out.println("Shkruani fjalen zevendesuese: ");
        String newText = reader.nextLine();

        if (!oldText.equals(newText) && text.contains(oldText)) {
            System.out.println(text.replace(oldText, newText));
        } else {
            System.out.println("Nuk ka pesuar teksti ndryshime!");
            System.out.println(text);
        }

    }
}






