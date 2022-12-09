package selection_decision;

// CTRL + ALT + L
public class NestedIfElseStatement {
    public static void main(String[] args) {
        double n1 = -3, n2 = 5.5, n3 = -2.5, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }
        System.out.println(largestNumber);

    }
}










