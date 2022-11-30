package converts_casting;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj deri ne sa po deshironi numrin me gjeneru: ");
        String strNumri = reader.nextLine();
        int numri = Integer.parseInt(strNumri);
// Math.random() gjeneron nje numer nga 0 duke perfshi edhe zeron deri ne 0.9999999999999999
        int randomNumber = (int) (Math.random() * (numri + 1));
        System.out.println("Numri i gjeneruar random eshte: " + randomNumber);
    }
}
