package arrays_matrixes;

public class Letrat {
    public static void main(String[] args) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "J", "Q", "K", "A"};
        String[] suits = {"\u2663", "\u2666", "\u2665", "\u2660"};
        //String[] suits = {"♣","♦","♥","♠"};
        String[] letrat = new String[ranks.length * suits.length];

//        letrat[0] = ranks[0] + suits[0];
//        letrat[1] = ranks[1] + suits[0];
//        letrat[2] = ranks[2] + suits[0];
//        letrat[12] = ranks[12] + suits[0];
//        letrat[13] = ranks[0] + suits[1];
//        letrat[14] = ranks[1] + suits[1];


        int counter = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                letrat[counter++] = ranks[i] + suits[j];
            }
        }
        for (int i = 0; i < letrat.length; i++) {
            System.out.printf("%5s", letrat[i]);
        }
    }
}







