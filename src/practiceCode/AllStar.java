package practiceCode;

public class AllStar {
    public static void main(String[] args) {
        System.out.println("\bQAZI QARDASIMIZA YOLKA ALIBLAR  ");
        for (int i = 0; i < 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
