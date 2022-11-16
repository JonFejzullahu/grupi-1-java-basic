package datatypes;

public class ConstantsVariable {
    public static void main(String[] args) {
        final double PI = 3.14;
        final float PAGA_MINIMALE = 264.56F;
        final char SHKRONJA_E_PARE = 'A';
        // PI = 1321313; //compile-time error

        double x = PI * PI + 100;
        System.out.println(PAGA_MINIMALE);
    }
}
