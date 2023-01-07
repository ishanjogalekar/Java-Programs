package Star_pattern;

import java.util.Scanner;

public class Hollow_Inner_Diamond {
    public static void main(String[] args) {
        int i, j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows:");
        int n=s.nextInt();
        for(i=1; i<=n; i++) {
            for(j=i; j<=n; j++) {
                System.out.print("*");
            }
            for(j=1; j<=(2*i-2); j++) {
                System.out.print(" ");
            }
            for(j=i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=1; i<=n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(j=(2*i-2); j<(2*n-2); j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
