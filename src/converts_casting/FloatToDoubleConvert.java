package converts_casting;

public class FloatToDoubleConvert {
    public static void main(String[] args) {
        float a = 12345.60f;
        double b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String shprehja1 = "x:" + 99;
        double shprehja2 = 11 * 0.25;

        System.out.println(shprehja1);
        System.out.println(shprehja2);
        System.out.println(10);

        System.out.println(Math.round(2.71231231));
        System.out.println(Integer.parseInt("123"));

        // Cast operator
        // datatype destination = (datatype) source;
        // source with bigger type than destination
        int numriInteger = 123;
        byte numriByte = (byte) numriInteger; // 127

        System.out.println(numriByte);
        int numriInteger1 = (int) 3.14;

        System.out.println(numriInteger1);
    }
}











