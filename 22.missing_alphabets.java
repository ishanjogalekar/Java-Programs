import java.util.*;
/*
Developed By Ishan Jogalekar
Considering only lower case alphabets
 */

public class missing_alphabets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input string and lower case string
        String str,str1;

        System.out.println("Enter String:");
        str = in.nextLine();
        str1 = str.toLowerCase();
        in.close();

        //input string to string array
        String[] arr = str1.split("");
        //Alphabets String
        String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");

        //creating hashsets s1 and s3 of strings  to get difference
        HashSet<String> s1 = new HashSet<>(Arrays.asList(arr));
        HashSet<String> s2 = new HashSet<>(Arrays.asList(alpha));

        //removing duplicate entries in oder to find missing alphabets
        s2.removeAll(s1);

        //Creating output
        String output = s2.toString()
                .replace(",","")
                .replace("[","")
                .replace("]","")
                .trim();

        //printing output
        System.out.println("*****------Missing Alphabets------****");
        if(output.isEmpty()){
            System.out.println("No missing alphabets");
        }
        else{
            System.out.println(output);
        }
    }
}
