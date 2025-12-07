package examCode;

import java.util.Scanner;

public class ManipulationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(cleanText(str));

    }

    public static String cleanText(String text) {
        text = text.trim();
        text = text.toLowerCase();
        text = text.replaceAll("[0-9]", "");
        text = text.replaceAll(" ","");
        return text;
    };
}
