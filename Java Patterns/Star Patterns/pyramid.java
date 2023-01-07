package Star_pattern;
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        int i,j,k;
        for(i=1;i<=row;i++){
            for(j=(row-1);j>=i;j--){
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
