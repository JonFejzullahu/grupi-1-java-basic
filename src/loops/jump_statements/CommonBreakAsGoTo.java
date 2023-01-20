package loops.jump_statements;

public class CommonBreakAsGoTo {
    public static void main(String[] args) {
        outer:
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Pass: i => " + i);
                for (int j = 1; j <= 100; j++) {
                    if (j == 10 && i == 3)
                        break outer;
                    System.out.println("j => " + j);
                }
            }
        }
    }
}
