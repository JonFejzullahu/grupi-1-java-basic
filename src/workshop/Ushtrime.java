package workshop;

import java.util.Scanner;

public class Ushtrime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sa studente: ");
        int noStudents = Integer.parseInt(reader.nextLine());

        String[] students = new String[noStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Studenti i %d: ", i + 1);
            students[i] = reader.nextLine();
        }

        System.out.print("Sa lende: ");
        int noSubjects = Integer.parseInt(reader.nextLine());

        String[] subjects = new String[noSubjects];

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("Lenda e %d: ", i + 1);
            subjects[i] = reader.nextLine();
        }

        int[][] grades = new int[noStudents][noSubjects];

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int) (Math.random() * 6 + 5);
            }
        }

        for (int[] row : grades) {
            for (int grade : row) {
                System.out.printf("%7d ", grade);
            }
            System.out.println();
        }
    }
}








