package converts_casting;

public class StringToPrimitiveTypes {
    public static void main(String[] args) {
        //Wrapper klasat mbeshtjellese te cilat ne prapavi funksionojne si primitivet
        String strByte = "123";
        byte b = Byte.parseByte(strByte);

        String strInt = "123456";
        int i = Integer.parseInt(strInt);

        String strFloat = "123.23";
        float f = Float.parseFloat(strFloat);

        String strDouble = "1234567.2131";
        double d = Double.parseDouble(strDouble);

        String strBoolean = "false";
        boolean bool = Boolean.parseBoolean(strBoolean);

        System.out.println(b);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
    }
}






