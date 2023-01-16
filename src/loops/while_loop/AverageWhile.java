package loops.while_loop;

public class AverageWhile {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            sum += count;
            count++;
        }
        double avg = (double) sum / --count;
        System.out.println("Average: " + avg);
    }
}
