package loops.for_loop;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1; // per shkak te prodhimit, ky eshte elementi njesi

        //fillo index prej 1 dhe perderisa je me i vogel se N, rritu per 1
        for (int index = 1; index <= n; index++) {
            System.out.printf("%d * %d = %d %n", factorial, index, factorial * index);
            factorial *= index; //  factorial = factorial * index;
        }
        System.out.printf("Faktorieli i numrit %d eshte %d%n", n, factorial);

        factorial = 1;

        for (int index = n; index >= 1; index--) {
            System.out.printf("%d * %d = %d %n", factorial, index, factorial * index);
            factorial *= index; //  factorial = factorial * index;
        }
        System.out.printf("Faktorieli i numrit %d eshte %d%n", n, factorial);

    }
}









