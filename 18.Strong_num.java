/*Question - Checking number is strong or not in java 
Strong number is a number whose sum of all digits’ factorial is equal to the number ‘n’. example : 145 = 1! + 4! + 5! */
//Ans:-

import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        int num, i;
        int fn, ln;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        num = sc.nextInt();
        int total = 0;
        int final_n = num;
        // Calculating factorial
        while (num != 0) {
            i = 1;
            fn = 1;
            ln = num % 10;
            while (i <= ln) {
                fn = fn * i;
                i++;
            }
            total = total + fn;
            num = num / 10;
        }
        if (total == final_n) {
            System.out.println("strong number\n");
        } else {
            System.out.println("Not strong number\n");
        }
    }
}



