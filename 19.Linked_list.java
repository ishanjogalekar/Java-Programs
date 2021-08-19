/*Question - Make 2 linked list add numbers in it. print multiplication of corresponding index numbers in another linked list.*/
//Ans :
import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,no, i ;

        // 1st linked list
        LinkedList<Integer> number1 = new LinkedList<>();
        System.out.println("Enter length of list1: ");
        n=sc.nextInt();
        System.out.println("Enter elements-");
        for(i=0;i<n;i++){
            int element=sc.nextInt();
            number1.add(element);
        }
        System.out.println(number1);

        // 2nd linked list
        LinkedList<Integer> number2 = new LinkedList<>();
        System.out.println("Enter length of list2: ");
        no=sc.nextInt();
        System.out.println("Enter elements-");
        for(i=0;i<no;i++){
            int element=sc.nextInt();
            number2.add(element);
        }
        System.out.println(number2);

        //Result of multiplication
        System.out.println("Result is:");
        LinkedList<Integer> result = new LinkedList<>();
        for ( i = 0; i < n; i++) {
            result.add(number1.get(i) * number2.get(i)) ;
        }
       System.out.println(result);
    }
}
