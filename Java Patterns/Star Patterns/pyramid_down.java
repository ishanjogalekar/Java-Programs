package Star_pattern;
import java.util.Scanner;

public class pyramid_down {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = in.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = row; k >= i; k--) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
