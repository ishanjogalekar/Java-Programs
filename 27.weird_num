import java.util.Scanner;
public class weird_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;
        System.out.println("Enter N:");
        int N = in.nextInt();
        System.out.println("Enter K:");
        int K = in.nextInt();
        for(int i=1;i<=N;i++){
            if((i % K !=0 )&&(find_sum(i)% K == 0)){
                count++;
            }
        }
        System.out.println("Total weird numbers are: "+count);
    }
    //Method to find sum of digits
    static int find_sum(int N){
        int digit, sum = 0;
        while(N > 0)
        {
            digit = N % 10;
            sum = sum + digit;
            N = N / 10;
        }
        return sum;
    }
}
