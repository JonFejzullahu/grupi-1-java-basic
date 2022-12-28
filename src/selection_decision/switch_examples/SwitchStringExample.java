package selection_decision.switch_examples;

import java.util.Scanner;

public class SwitchStringExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj meny-ne e aplikacionit: ");
        String menu = reader.nextLine();

        switch (menu) {
            case "Administration", "administration":
                System.out.println("Welcome to administration menu");
                break;
            case "User":
            case "user":
                System.out.println("Welcome to user page");
                break;
            default:
                System.out.println("You dont have access in this menu!");
                break;
        }
        System.out.println("Application closed!");
    }
}









