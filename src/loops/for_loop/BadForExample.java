package loops.for_loop;

public class BadForExample {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println(i);
        }

        int j = 1;
        for (; j <= 10; ) {
            System.out.println(j++);
        }

        int z = 1;
        for (; ; ) {
            if (z > 10) break;
            System.out.println(z++);
        }


    }
}
