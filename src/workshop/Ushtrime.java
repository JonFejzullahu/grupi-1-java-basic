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

        System.out.println("DETYRAT");
        System.out.println("--------------------------------------");
        System.out.println("Zgjidh studentine per me pa mesataren: ");
        String studentName = reader.nextLine();

        int stundetIndex = -1; // -1 nenkupton qe nuk gjindet

        for (int i = 0; i < students.length; i++) {
            if (studentName.equals(students[i])) {
                stundetIndex = i;
                break;
            }
        }

        if (stundetIndex == -1) {
            System.out.println("Studenti i kerkuar nuk studion te na, ke gabu kolegjin!");
        } else {
            System.out.printf("Certifikata e studentit %s %n", students[stundetIndex]);
            for (int i = 0; i < grades[stundetIndex].length; i++) {
                System.out.printf("%s: %d %n", subjects[i], grades[stundetIndex][i]);
            }
        }


        System.out.println("---------------------------------------");
        System.out.println("Zgjidhni lenden me pa mesataren e vlersimit per te: ");
        String subjectName = reader.nextLine();

        int subjectIndex = -1;

        for (int i = 0; i < subjects.length; i++) {
            if (subjectName.equals(subjects[i])) {
                subjectIndex = i;
                break;
            }
        }
        if (subjectIndex != -1) {
            double sum = 0.0;

            for (int i = 0; i < noStudents; i++) {
                sum += grades[i][subjectIndex];
            }

            double average = sum / noStudents;
            System.out.printf("Nota mesatare per %s eshte: %.2f%n", subjectName, average);

        } else {
            System.out.println("Lenda nuk eshte pjese e kurikules se kolegjit!");
        }

    }
}








