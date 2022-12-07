package operators;

public class BitWiseOperatore {
    public static void main(String[] args) {
        System.out.println(13 & 9); // 1101 & 1001 = 1001
        System.out.println(13 | 2); // 1101 | 0010 = 1111
        System.out.println(1 << 1);
        System.out.println(1 << 2);
        System.out.println(1 << 3);
        System.out.println(3 << 3);
        System.out.println(Math.pow(2, 10));

        int x = 1 << 2;
        x = x << 2;
        x <<= 3;
        x = x & 10;
        x &= 10;

        System.out.println(~10);
    }
}
