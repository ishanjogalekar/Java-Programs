package package1;
import java.util.Scanner;
class UserDefinedException extends Exception
{
 String ms;
 UserDefinedException()
 {
 }
 UserDefinedException(String ms)
 {
 this.ms = ms;
 }
 @Override
 public String toString()
 {
 return "Invalid! UserDefinedException :" + ms;
 }
}
public class Test {
 public static void main(String[] args)
 {
 System.out.println("19BCE2250 Ishan Sagar Jogalekar");
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number :");
 try
 {
 int num = sc.nextInt();
 try
 {
 if(num < 0)
 {
 throw new UserDefinedException("Number is
negative");
 }
 else if(num >= 0 && num <= 25)
 {
 throw new UserDefinedException("Number is in the
range of 0-25");
 }
 }
 catch (UserDefinedException e)
 {
 System.out.println(e);
 }
 finally
 {
 System.out.println("The number entered by the user is
: " + num); //this code is always executed
 }
 }
 catch (Exception e)
 {
 System.out.println(e);
 }
 }
}
