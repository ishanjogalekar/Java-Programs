/*Question - 
Create a class called Student with Data members (1) Regno 
(2) Name 
(3)static data member named as Univ_name and static counter variable to
store number of objects created and Methods 
(1) GetMethod (2)PrintMethod (3)Constructor (4) Parametrized constructor
Also create a class called Courses with details like Course code, name,
slot and venue along with necessary methods.
(1)Main method has to be provided in Registration class
(2) create 4 course objects with two A1 slot courses, two B1 slot courses
(3)create two students objects and get display all course details to them
and inform them to choose two subjects
(4) if the selected courses have same slots, ask student to choose
without clashing
(5) print the selected course in a table format with all necessary details.*/

//Code - 
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
      FileWriter fileR = new FileWriter("C:\\Users\\Dell\\Desktop\\MyInfo_19BCE2250.txt");
      fileR.write(reg + " ");
      fileR.append(name + " ");
      fileR.append(phone + " ");
      fileR.append(cgpa + " ");
      fileR.close();
      } catch (Exception e) {System.out.println(e);}
    try {
      FileReader f1 = new FileReader("C:\\Users\\Dell\\Desktop\\MyInfo_19BCE2250.txt");
      int i;
      while ((i = f1.read()) != -1) {
        System.out.print((char) i);
      }
      f1.close();
    } catch (Exception e) {System.out.println(e);}
    System.out.println();
    try {
      FileOutputStream FileO1 = new FileOutputStream("C:\\Users\\Dell\\Desktop\\MyInfo_19BCE2250_After.txt");
      ObjectOutputStream ob0 = new
      ObjectOutputStream(FileO1);
      System.out.println("\n");
      ob0.writeObject(s0);
      ob0.close();
      FileInputStream FileO2 = new FileInputStream("C:\\Users\\Dell\\Desktop\\MyInfo_19BCE2250_After.txt");
      ObjectInputStream ob1 = new 
      ObjectInputStream(FileO2);
      StudentInfo s1= (StudentInfo) ob1.readObject();
      System.out.println("Name:"+" "+s1.nameStudent);
      System.out.println("Reg No"+" "+s1.reg);
      System.out.println("CGPA"+" "+s1.cgp);
      System.out.println("Phone no"+" "+ s1.phone_no);
    }catch (Exception e) {System.out.println(e);}
  }
}
