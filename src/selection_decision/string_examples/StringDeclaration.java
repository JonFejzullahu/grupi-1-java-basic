package selection_decision.string_examples;

public class StringDeclaration {
    public static void main(String[] args) {
        String name1 = "Naim";
        String name2 = "Naim";
        String name3 = new String("Naim");
        //fjala kyqe new gjithmon rezervon hapesire te re memorike
        String name4 = new String("Naim");
        String name5 = new String(name1);


        System.out.println(name1 == name2);
        System.out.println(name3 == name4);
        System.out.println(name5 == name1);

    }
}
