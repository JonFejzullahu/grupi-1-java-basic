package loops.for_loop;

public class NestedForExample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%d,%d %n", i, j);
            }
        }
    }
}
