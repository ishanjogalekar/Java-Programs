//Question - Vowelgram program using Java

//Code -
import java.util.Scanner;

public class vowelgram {

    public static void main(String[] args) {
        vowelgram.check();
    }
    static void check(){
        int a = 0,e=0,i=0,o=0,u=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String sen = sc.nextLine();
        sen = sen.toLowerCase();
        char ch = 0;
        for (int j = 0; j < sen.length(); ++j) {
            ch = sen.charAt(j);

            switch (ch) {
                case 'a':
                    a = a + 1;
                    break;
                case 'e':
                    e = e + 1;
                    break;
                case 'i':
                    i = i + 1;
                    break;
                case 'o':
                    o = o + 1;
                    break;
                case 'u':
                    u = u + 1;
                    break;
            }
        }
            if(a>=1 && e>=1 && i>=1 && o>=1 && u>=1){
                System.out.println("Sentence is Vowelgram");
            }
            else{
                System.out.println("Sentence is Not vowelgram");
            }
        }
    }
