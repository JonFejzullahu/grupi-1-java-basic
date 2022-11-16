package datatypes.ushtrimet.gr1;

public class StringExamples {
    public static void main(String[] args) {
        String name = "Naim";
        String titulli = "Kush e solli Doruntinen!";
        String autori = "Ismail Kadare";
        int x = 10;
        int y = 20;
        String point = "(" + x + "," + y + ")";

        System.out.println(name);
        System.out.println(titulli);
        System.out.println(autori);
        System.out.println(point);

        System.out.println(autori.charAt(0));
        System.out.println(autori.charAt(autori.length() - 1));
    }
}
