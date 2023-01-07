package Star_pattern;
import java.util.Scanner;

public class Sand_Timer_Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter no of rows:");
        int row = in.nextInt();
        for ( i = 1; i <= row; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for ( k = row; k >= i; k--) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2;i<=row;i++){
            for(j=(row-1);j>=(i-1);j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(" ");
                System.out.print("*");  //or use System,out.print(" *");
            }
            System.out.println();

        }
    }
}
