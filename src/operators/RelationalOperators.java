package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean fillimiIShekullit = 2022 % 100 == 0;
        boolean fillimiIMileniumit = 2000 % 1000 == 0;

        System.out.println(fillimiIShekullit);
        System.out.println(fillimiIMileniumit);

        int month = 12;
        System.out.println(month >= 1 && month <= 12);
    }
}









