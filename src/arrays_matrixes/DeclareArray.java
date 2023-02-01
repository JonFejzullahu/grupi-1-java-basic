package arrays_matrixes;

public class DeclareArray {
    public static void main(String[] args) {
        int[] notat; // deklaroj vargun notat
        notat = new int[100]; // rezervo 100 vende memorie per notat

        String[] names = new String[100];
        String[] ekipet = new String[20];
        String[] emrat = {"Naim", "Jon", "Filan"};
        String[] mbiemrat = {"Sulejmani", "Fejzullahu", "Fisteku"};
        int[] vlersimet = {86, 99, 100};

        System.out.println(emrat[0]);
        System.out.println(vlersimet[1]);

        System.out.printf("%s %s %d %n", emrat[0], mbiemrat[0], vlersimet[0]);
        System.out.printf("%s %s %d %n", emrat[1], mbiemrat[1], vlersimet[1]);

        String emriProfes = emrat[0];
        System.out.println(emriProfes);
        vlersimet[0] = 91;
        System.out.println(vlersimet[0]);


    }
}
