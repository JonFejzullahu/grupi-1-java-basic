package methods;

public class NewClass {
    public static void main(String[] args) {
        int max1 = max(10, 20);
        System.out.println(max1);
        System.out.println(max(100, 50));
        double max2 = max(10.2, 20);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, int b) {
        return a > b ? a : b;
    }

    public static double max(int a, double b) {
        return a > b ? a : b;
    }

}







