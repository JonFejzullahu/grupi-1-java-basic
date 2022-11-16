package datatypes;

class Scope {
    public static void main(String[] args) {
        int x; // known to all code within main method
        x = 10; // inicializimi i variables x me vleren 10

        if (x == 10) { // nese x eshte e barabarte me vleren 10
            int y = 20; // y is known only to this block (if block)

            // x is known here because it's global
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y is not known here because its scope has already been closed
        // y = 200;

        //x is still know here because it is his own scope
        System.out.println("x is " + x);
    }
}
