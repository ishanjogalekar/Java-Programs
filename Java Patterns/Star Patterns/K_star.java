package Star_pattern;
import java.util.Scanner;

public class K_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        int i,j;
        for ( i = 1;i<=row;i++) {
            for (j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1;i<row;i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
