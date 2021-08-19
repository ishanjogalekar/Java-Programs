/*Question - Write your information [as string as well as MyInfo Class object] like regno, name, cgpa and phno into a file and read from the file and
print in the console. Use Serialization and Deserialization in the program.
*/
//Ans :
import java.io.*;
import java.util.*;

class StudentInfo implements Serializable{
    String reg;
    String nameStudent;
    String cgp;
    String phone_no;
    StudentInfo( String r,String na,String c,String P){
        reg = r;
        nameStudent = na;
        cgp=c;
        phone_no=P;
    }
}
public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Regno: ");
        String reg = scan.nextLine();
        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Enter cgpa:");
        String cgpa = scan.nextLine();
        System.out.println("Enter Phone number:");
        String phone = scan.nextLine();
        StudentInfo s0 = new
        StudentInfo("19BCE2250","Ishan","8.62","9421043707");
        try {
            FileWriter fileR = new
            FileWriter("C:\\Users\\Dell\\Desktop\\MyInfo_19BCE2250.txt");
            fileR.write(reg + " ");
            fileR.append(name + " ");
            fileR.append(phone + " ");
            fileR.append(cgpa + " ");
            fileR.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileReader f1 = new FileReader("File_location");
            int i;
            while ((i = f1.read()) != -1) {
                System.out.print((char) i);
            }
            f1.close();
         } catch (Exception e) {
             System.out.println(e);
            }
            System.out.println();
            try {
                FileOutputStream FileO1 = new FileOutputStream("File_location1");
                ObjectOutputStream ob0 = new ObjectOutputStream(FileO1);
                System.out.println("\n");
                ob0.writeObject(s0);
                ob0.close();
                FileInputStream FileO2 = new FileInputStream("file_location2");
                ObjectInputStream ob1 = new 
                ObjectInputStream(FileO2);
                StudentInfo s1= (StudentInfo) ob1.readObject();
                System.out.println("Name:"+" "+s1.nameStudent);
                System.out.println("Reg No"+" "+s1.reg);
                System.out.println("CGPA"+" "+s1.cgp);
                System.out.println("Phone no"+" "+ s1.phone_no);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


