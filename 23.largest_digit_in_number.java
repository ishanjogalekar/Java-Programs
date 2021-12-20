import java.util.*;
/*
Developed By Ishan Jogalekar
 */
public class largest_digit_in_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,rem,l=0;
        //Enter number
        System.out.println("Enter number:");
        num = in.nextInt();
        in.close();
        while (num>0){
            //getting each digit of number
            rem = num % 10;

            //maximum number logic
            if(l<rem){
                l = rem;
            }
            //Divide number by 10 after each loop till number < 0
            num = num/10;
        }
        System.out.println("Largest digit in number is: "+l);
    }
}
