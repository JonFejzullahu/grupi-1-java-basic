package arrays_matrixes;

public class Filtrimet {
    public static void main(String[] args) {
        String[] names = {"Naim", "Filan", "Fistekim", "Yll", "Tetris", "Jon"};
        /*
        Te shtypet te gjitha emrat qe i kane  3 karaktere, ose qe fillojne me shkronjen
        F por nuk mbarojne me shkronjen M
         */

        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            if (name.length() == 3 || (name.toLowerCase().startsWith("f")
                    && !name.toLowerCase().endsWith("m"))) {
                System.out.println(name);
            }
        }

    }
}
