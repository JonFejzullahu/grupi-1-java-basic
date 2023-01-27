package methods.ushtrimet;

public class DetyraPrime {

    public static void main(String[] args) {
        int numrat = 1;
        while (numrat <= 500) {
            if (isPrime(numrat))
                System.out.println(numrat);
            numrat++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }


}




