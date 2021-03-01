import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String s=null;
 int i=0;
 while(i<3) {
 System.out.println("Enter Value 1/2/3: ");
 int n = sc.nextInt();
 switch (n) {
 case 1:
 try {
 int data = 5 / 0;
 }
 catch (ArithmeticException e) {
 System.out.println(e);
 }
 System.out.println("rest of the code");
 break;
 case 2:
 try {
 int m = s.length();
 } catch (NullPointerException f) {
 System.out.println(f);
 }
 System.out.println("rest of code");
 break;
 case 3:
 try {
 int arr[] = {1, 3, 5, 7};
 System.out.println(arr[10]);
 } catch (ArrayIndexOutOfBoundsException g) {
 System.out.println(g);
 }
 System.out.println("rest of the code");
 }
 i++;
 }
 }
}
