package loops.do_while_loop;

public class BasicExample {
    public static void main(String[] args) {
        System.out.println("DO WHILE");
        int number = 1;
        do {
            System.out.println(number++);
        } while (number <= 10);

        System.out.println("WHILE");
        number = 1;
        while (number <= 10) {
            System.out.println(number++);
        }
    }
}




