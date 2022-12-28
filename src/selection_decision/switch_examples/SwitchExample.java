package selection_decision.switch_examples;

public class SwitchExample {
    public static void main(String[] args) {
        int menu = 4;

        switch (menu) { //byte, char, int dhe String
            case 1:
                System.out.println("Keni zgjedhur menun Perdoruesit!");
                break;
            case 2:
            case 3:
                System.out.println("Menute nuk jane ne dizpozicion!");
                break;
            case 4:
                System.out.println("Menu 4 keni zgjedhur");
            case 5:
                System.out.println("Menu 5 keni zgjedhur");
                break;
            default:
                System.out.println("Default menu");
                break;
        }

        switch (menu) {
            case 1 -> System.out.println("Keni zgjedhur menun Perdoruesit");
            case 2, 3 -> System.out.println("Menyte nuk jane ne dizpozicion!");

            case 4 -> {
                System.out.println("Meny 4 do te hapet");
                System.out.println("Meny 5 do te hapet");
            }

            case 5 -> System.out.println("Meny 4 do te hapet");

            default -> System.out.println("Default menu!");
        }


    }
}












