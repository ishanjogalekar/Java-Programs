// Question - Fibonacci Series in Java.

//Code- 
import java.util.*;
import java.math.*;
public class Basic_codes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1=0,n2=1;
        System.out.println("Enter the number of terms in fibonacci series: ");
        int n = s.nextInt();
        System.out.println(n1+","+n2);
        while (n>2){
            int c;
            c = n1+n2;
            System.out.println(","+c);
            n1 = n2;
            int a;

            n2 = c;
            n-=1;
        }
    }
}
