package loops.jump_statements;

public class ContinueExample {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++;
            if (i == 5)
                continue;
            System.out.println(i);
        }

        i = 0;
        while (i < 10) {
            i++;
            if (i != 5)
                System.out.println(i);
        }
    }
}
