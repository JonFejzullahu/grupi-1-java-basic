package datatypes.ushtrimet.gr1;

public class PrintExamples {
    public static void main(String[] args) {
        System.out.print(10);
        System.out.print("Naim");
        System.out.print("Sulejmani");
        // 10NaimSulejmani
        System.out.println("KU JE BE NJERI");

        String name = "Naim";
        String surname = "Sulejmani";
        String city = "Shkup";

        // %n -> new line kjo vlene vetem tek printf
        System.out.printf("Une jam %s %s i lindur ne %S!%n", name, surname, city);

        System.out.println("Une jam " + name + " " + surname + " i lindur ne " + city + "!\n");

        System.out.printf("Tani jemi ne vitin %d dhe rroga mesatare akoma eshte %.3f!%n",
                2022, 256.63);
    }
}





