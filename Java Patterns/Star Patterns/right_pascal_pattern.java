package Star_pattern;
import java.util.Scanner;

public class left_pascal_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            for (int i = 1;i<=row;i++) {
                for (int j = (row-1); j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

