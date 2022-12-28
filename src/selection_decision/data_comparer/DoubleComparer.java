package selection_decision.data_comparer;

public class DoubleComparer {
    public static void main(String[] args) {
        double vlera = 1.0;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;
        vlera -= 0.1;

        System.out.println(vlera);
        System.out.println(vlera == 0.0);

        final double TOLERANCE = 0.00000000001;

        System.out.println(Math.abs(vlera) < TOLERANCE);
    }
}





