package Star_pattern;

import java.util.Scanner;

public class Hollow_Outline_Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = s.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            }
            else {
                System.out.println("*");
            }
        }
    }
}
