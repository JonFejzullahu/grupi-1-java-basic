package datatypes;

public class PrimitiveTypesDeclaration {
    public static void main(String[] args) {
        int vleraX = 300;
        int vleraY = 255;
        // block
        {
            int paga = 200;
            paga = vleraX * 2;
            paga = 300;
        }
// out of the block
//        paga = 400;

        int shuma = vleraX + vleraY;

        System.out.println("Shuma eshte " + shuma);

        System.out.println(Math.sqrt(4)); // square root
    }
}
