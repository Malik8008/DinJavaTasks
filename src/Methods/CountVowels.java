package Methods;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("I write code in Java"));
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'  || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'  || str.toLowerCase().charAt(i) == 'u' ) {
                count++;
            }
        }
        return count;
    }
}
