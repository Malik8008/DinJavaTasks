package conditionalStatement;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Task Check Vowel Or Consonant");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char x = input.next().toLowerCase().charAt(0);
        if(x=='a' || x=='e'|| x=='i'|| x=='o'|| x=='u'){
            System.out.println("the character is a vowel");
        }else {
            System.out.println("the character is consonant");
        }
    }
}
