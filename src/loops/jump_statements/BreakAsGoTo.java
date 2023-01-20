package loops.jump_statements;

public class BreakAsGoTo {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Start Of Third Scope");
                    if(t) break first;
                    System.out.println("End of third Scope");
                }
                System.out.println("End of second scope");
            }
            System.out.println("end of first scope");
        }
        System.out.println("MAIN SCOPE");
    }
}
