package methods.ushtrimet;

public class Detyra1 {
    public static void main(String[] args) {
        System.out.println(getTolal(10, 5));
        System.out.println(isEven(10));
        System.out.println(isEven(11));
    }

    public static int getTolal(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else return false; // nuk ka nevoje per else
    }

    public static boolean isEven1(int number) {
        return number % 2 == 0 ? true : false;
    }


    public static boolean isEven2(int number) {
        return number % 2 == 0;
    }


}

















