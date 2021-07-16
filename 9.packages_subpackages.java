/*Question -
Create a class person with datamembers like name,
age, phno with methods getvalues and printvalues, store
the class in a package called pack1. Define a class
named student in subpackage SubPack1 and extend
the class defined as person. Use this class in a program
of different package Pack2, create an object and invoke
the methods defined in pack1 class file.*/

//Code-

//Package1: (Person class)
package pack1;
import java.util.Scanner;
public class person {
  String name,age,ph;
  public void getValue() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Person Name:");
    name = sc.nextLine();
    System.out.println("Enter Person Age: ");
    age = sc.nextLine();
    System.out.println("Enter Phone no of person: ");
    ph = sc.nextLine();
  }
  public void printValue(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Phone number: "+ph);
  }
}


//Subpack1:(student class)
package subpack1;
import pack1.*;
import java.util.Scanner;
public class student extends person {
  String n,a,roll,ph;
  public void get(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Name: ");
    n=s.nextLine();
    System.out.println("Enter Age: ");
    a=s.nextLine();
    System.out.println("Enter Roll no: ");
    roll=s.nextLine();
    System.out.println("Enter Phone no: ");
    ph=s.nextLine();
  }
  public void print(){
    System.out.println("Name : "+n);
    System.out.println("Age : "+a);
    System.out.println("Roll no: "+roll);
    System.out.println("Phone no of Student: "+ph);
  }
}


//Pack2: (Final class)
package pack2;
import pack1.*;
import subpack1.*;
public class Final {
  public static void main(String[] args) {
    person o1=new person();
    o1.getValue();
    o1.printValue();
    student o2=new student();
    o2.get();
    o2.print();
  }
}
