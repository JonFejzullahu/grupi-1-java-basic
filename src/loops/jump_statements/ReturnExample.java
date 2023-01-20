package loops.jump_statements;

public class ReturnExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i == 5)
                return;
            System.out.println(i++);
        } while (i <= 10);

        System.out.println("Tung tung!!!");
    }
}
