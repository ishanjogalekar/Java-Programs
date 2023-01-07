package Star_pattern;
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        int i, j, k;
        for(i=1;i<=row;i++)
        {
            for (j = (row - 1); j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" ");
                System.out.print("*");  //or use System,out.print(" *");
            }
            System.out.println();
        }
        for (i = 2; i <= row; i++) {
            for ( j = 1; j <= (i-1); j++) {
                System.out.print(" ");
            }
            for ( k = row; k >= i; k--) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
