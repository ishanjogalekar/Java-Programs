package Star_pattern;
import java.util.Scanner;
public class left_pascal_pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int numberOfRows= sc.nextInt();
        for (int i= 1; i<=numberOfRows; i++)
        {
            for (int j=i; j<numberOfRows; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=numberOfRows; i>=1; i--)
        {
            for(int j=i; j <=numberOfRows;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
