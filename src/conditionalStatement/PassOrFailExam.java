package conditionalStatement;

import java.util.Scanner;

public class PassOrFailExam {
    public static void main(String[] args) {
        System.out.println("Task Pass or  Fail Exam");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: ");
        byte x = input.nextByte();
        if (x < 0 || x > 100) {
            System.out.println("Invalid Input");
        }
        else if (x >= 51) {
            System.out.println("Student pass exam");
        } else {
            System.out.println("Student fail exam");
        }
    }
}
