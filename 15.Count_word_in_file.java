/*Question - Traverse a file and count the words “CSE1007” and “JAVA”, print the counts in the console.*/
//Ans:
import java.io.*;
import java.util.regex.*;
public class Traverse_File_19BCE2250 {
    public static void main(String[] args) {
        String w = "";
        try {
            FileReader fileR = new FileReader("File_Location");
            int num;
            while ((num = fileR.read()) != -1) {
                w = w + (char) num;
            }
        } catch (Exception e) {
            System.out.print("error in reading the file");
        }
        Pattern C1 = Pattern.compile("CSE1007");
        Matcher M1 = C1.matcher(w);
        int CSE1007_count = 0;
        while (M1.find()){
            CSE1007_count++;
        }
        Pattern C2 = Pattern.compile("JAVA");
        Matcher M2 = C2.matcher(w);
        int JAVA_count = 0;
        while (M2.find()){
            JAVA_count++;
        }
        System.out.println(w);
        System.out.println("the total number of words CSE1007 is " + CSE1007_count);
        System.out.println("the total number of words JAVA is " + JAVA_count);
    }
}
