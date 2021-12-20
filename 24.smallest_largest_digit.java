import java.util.Scanner;
/*
Developed By Ishan
Find smallest and largest digit in number using Math package
 */
public class smallest_largest_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int smallest = 9;
        int largest = 0;
        while(n != 0)
        {
            int r = n % 10;
            largest = Math.max(r,largest);
            smallest = Math.min(r, smallest);
            n = n / 10;
        }
        System.out.println("Smallest no:"+smallest);
        System.out.println("Largest no:"+largest);
    }
}
