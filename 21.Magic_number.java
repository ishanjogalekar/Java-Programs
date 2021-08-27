import java.util.Scanner;
public class magic_number {
    public static void main(String[] args) {
        int num,rem, sum = 0;
        Scanner sc = new Scanner(System.in); // Scanner class to take input
        System.out.println("Enter number :");
        num = sc.nextInt(); // Taking input of number from user

        int temp = num; // Assigning num to temp variable
        while (temp > 9){
            while(temp > 0) {
                rem = temp % 10; // calculating remainder
                sum = sum + rem;
                temp = temp / 10; //divinding number by 10 to remove last digit
            }
            temp = sum;

            sum = 0;
        }
        if(temp == 1){
            System.out.println("Hence, "+num+" is magic number.");
        }
        else{
            System.out.println(num+" Not Magic number");
        }
    }
}
