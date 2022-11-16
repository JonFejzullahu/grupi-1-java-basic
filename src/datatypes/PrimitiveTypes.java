package datatypes;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // numrat e plote (integers)
        byte mosha; //deklarimi vlera eshte e pa inicializuar
        byte tipi = 20; // deklarimi dhe inicializimi
        mosha = 30; // dhenia vlere
        byte muaji = 1;
        byte dita = 23;
        byte nota = 10;
        byte a, b, c = 30; // deklarimi i me shume se nje variable i tipit te njejte
        System.out.println(mosha);

        short viti = 2022;
        short paga = 170;
        System.out.println(paga);
        short a1, b1, c1;
        paga = 200;
        System.out.println(paga);

        int numriPersonal = 1234567890;
        int a2, b2, c3;

        long largesiaEGalaktikes = 1123131313123L; // for type long add l or L in the end
        long numriPopullsiseNeBote = 7_000_000_000L;


        float tempMin = 0.5f;
        float tempMax = 2.2f, shpejtesiaEDrites = 299777.70F;

        double largesiaXY = 2.34;


        char shkronjaEPareEMadhe = 'A';
        char shkronjaEPareEVogel = 'a';
        char unicodeCharacter = '\u1323';

        System.out.println(shkronjaEPareEMadhe);
        System.out.println(1 + shkronjaEPareEMadhe - 1);

        char shkronjaEe = 'ë';
        System.out.println(1 + shkronjaEe - 1);
        // ALT + 137 , ALT + 65

        boolean isAlive = true;
        boolean passive = false;
        boolean checkIsGreater = 10 > 9;

        float vleraX = 100f;
        double vleraY = 200d;


    }
}







