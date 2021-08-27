import java.util.*;
public class Stringadd{
    static String findsum(String a , String b){
        String result = "";
        int l1 = a.length();
        int l2 = b.length();
        int c = 0;
        if(a.length() > b.length()){
            String t = a;
            a = b;
            b = t;
        }
        //Reverse String
        a=new StringBuilder(a).reverse().toString();
        b=new StringBuilder(b).reverse().toString();

        for(int i=0;i<l1;i++){
            int sum = ((int)(a.charAt(i) - '0') +(int)(b.charAt(i) - '0') + c);
            result +=(char)(sum % 10 + '0');
            c = sum/10;
        }
        for (int i = l1; i < l2; i++)
        {
            int sum = ((int)(b.charAt(i) - '0') + c);
            result += (char)(sum % 10 + '0');
            c = sum / 10;
        }
        if (c > 0){
            result += (char)(c + '0');
        }
        result =new StringBuilder(result).reverse().toString();
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");  
        String a = sc.next();
        System.out.println("Enter second no:");  
        String b = sc.next();
        System.out.println("Sum="+findsum(a,b));

    }
}
