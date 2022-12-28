package selection_decision.string_examples;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Shume shume, shume shume zhurme!";
        char shkronjaEPare = text.charAt(0);
        char shkronjaEDyte = text.charAt(1);
        System.out.println("Shkronja e pare e tekstit eshte: " + shkronjaEPare);
        System.out.println(shkronjaEDyte);

        System.out.println("Gjatesia e tekstit eshte: " + text.length());

        char shkronjaEFundit = text.charAt(text.length() - 1);
        System.out.println(shkronjaEFundit);

        String emriPlote = String.format("%s %s", "Naim", "Sulejmani");
        System.out.println(emriPlote);


        System.out.println(text.substring(10));
        System.out.println(text.substring(13, 18));

        System.out.println(text.substring(0, 10));

        System.out.println(text.contains("shume"));
        System.out.println(text.contains("Text"));

        String bashkimi = String.join(",", "1", "2", "3", "4", "5");
        System.out.println(bashkimi);

        System.out.println(bashkimi.equals("1,2,3,4,5"));

        String tekstiIZbrazur = "";

        System.out.println(tekstiIZbrazur.isEmpty());
        System.out.println(text.isEmpty());

        String tekstiBlank = "    ";
        System.out.println(tekstiBlank.isBlank());
        System.out.println(tekstiIZbrazur.isBlank());

        System.out.println(text.concat("Ska Pauze!"));

        String vlersimi = "Nota juaj eshte 10!";

        System.out.println(vlersimi.replace("10", "5"));
        System.out.println(vlersimi.replace('N', 'n'));
        System.out.println(vlersimi);
        vlersimi = vlersimi.replace('!', '?');
        System.out.println(vlersimi);
        System.out.println("Naim".equalsIgnoreCase("naim"));
        System.out.println(text.split(" ").length);
        int index = text.indexOf("zh");
        System.out.println(index);
        // nese nuk e gjen na kthen -1, perndryshe na kthen 0 ose vlere pozitive
        index = text.indexOf("sh", 30);
        System.out.println(index);


        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        String emri = "  Filan Fisteku  ";
        System.out.println(emri);
        System.out.println(emri.trim());


        String vleraX = String.valueOf(10.10f);
        System.out.println(vleraX);

        System.out.println(text.repeat(3));

    }
}







