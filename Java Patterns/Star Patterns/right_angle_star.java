import java.util.Scanner;

public class right_angle_star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = in.nextInt();
        for (int i = 0;i<row;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
