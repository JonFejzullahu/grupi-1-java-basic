package methods;

public class Kindness {
    public static void main(String[] args) {
        sayHello("Kosovare");
        sayHello("Yll");
        sayHello("Elton");
        sayHello("Aldi");
        printNameAndAge("Aldi", 30);
        printNameAndAge("Ylli", 44);
        printNameAndAge("Profa", 17);

        System.out.println(addFiveToNumber(10));
        System.out.println(mbledhiNumrat(20, 30));
        System.out.println(getFullName("Naim", "Sulejmani"));
    }

    private static void sayHello(String to) {
        System.out.printf("Hello %s! %n", to);
    }

    private static void printNameAndAge(String name, int age) {
        System.out.printf("%s is %d years old! %n", name, age);
    }

    private static int addFiveToNumber(int number) {
        return number + 5;
    }

    private static int mbledhiNumrat(int numri1, int numri2) {
        return numri1 + numri2;
    }

    private static String getFullName(String name, String surname) {
        return name + " " + surname;
    }

}
