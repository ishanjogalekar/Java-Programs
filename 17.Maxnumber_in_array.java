/*Question - Maximum number in array using user defined method.*/
//Ans:
import java.util.Scanner;
public class testarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int[] array = new int[20];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("*** Initial Array ***");
        for (int i=0; i<n; i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println("\nMaximum number is");
        max(array,n);
    }
    
    //Method to print maximun no of array 
    public static void max(int[] arr , int size){
        int maxint = arr[0];

        for (int j = 1; j < size; j++) {
            if (arr[j] > maxint) {
                maxint = arr[j];
            }
        }
        System.out.println(maxint);
    }
}
