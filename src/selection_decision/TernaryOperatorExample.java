package selection_decision;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        double number = 5.5;
        String result = number > 0 ? "Positive" : "Not positive!";
        //              kushti     ?  rezultati kur eshte true  : rezultati kur eshte false
        System.out.println(result);

        if (number > 0) {
            result = "Positive";
        } else {
            result = "Not positive";
        }
        System.out.println(result);

        //dont do it in this form, use if-else-if instead
        result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
    }
}










