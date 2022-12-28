package selection_decision.data_comparer;

public class StringComparer {
    public static void main(String[] args) {
        String emri1 = "Naim";
        String emri2 = "Altin";
        String emri3 = "Fitore";
        String emri4 = "Albina";

        System.out.println(emri1.equals(emri2));
        System.out.println(!emri1.equals(emri2));
        System.out.println(emri2.compareTo(emri3));
        System.out.println(emri2.compareTo(emri4));
    }
}
