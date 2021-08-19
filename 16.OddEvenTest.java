/*Question - OddEvenTest :- Checking number is odd or even using java recursion , user defined method.*/
//Ans:-
import java.util.Scanner;
public class OddEvenTest {
    public static boolean isOdd(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        boolean r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        n = sc.nextInt();
        r = isOdd(n);

        if(r){
            System.out.println(n +" is even number.");
        }
        else{
            System.out.println(n +" is odd number.");
        }
        sc.close();
    }
}
