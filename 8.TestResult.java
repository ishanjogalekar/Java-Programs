/*Question - 
Design a class called Participants with properties like Name, Phno,
Branch and University, TestResult_Classification[L1,L2,L3,L4,L5]. Create a
static method to display a message as follows based on the selection
criteria,
(i) If student test result classification is L1, congratulate the student
and inform that he/she has been selected for both Full time
intership as well as Full time job
(ii) If student test result classification is L2 or L3, inform the student
that he/she has been selected for Full time intership and Job
may be offered based on intership Performance.
(iii) If student test result classification is L4 or L5, inform that he/she
has been selected for Part time intership of 21 days.
Create atleast three Participants objects of array and then invoke static
method to display the message.
Note: Don’t use if statement for conditional check, instead use Switch
Case statement.*/

//Code-
import java.util.Scanner;
public class participants {
  public static void main(String[] args) {
    selection obj[] = new selection[3] ;
    obj[0]=new selection();
    obj[0].getData();
    obj[1]=new selection();
    obj[1].getData();
    obj[2]=new selection();
    obj[2].getData();
  }
}
class selection {
  static void getData() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Your Name:");
    String N = s.nextLine();
    System.out.println("Enter Your phone no:");
    String P = s.nextLine();
    int n = P.length();
    if (n != 10) {
      System.out.println("Enter valid phone no");
    } 
    else {
      System.out.println("Enter Your Branch and University");
      String B = s.nextLine();
      String U = s.nextLine();
      System.out.println("Enter Condition as:");
      String L = s.next();
      switch (L) {
        case "L1":
          System.out.println("Congrats " + N + " You selected for Full time internship and Full time job");
          break;
        case "L2":
          System.out.println("Congrats " + N + " You selecte for selected for Full time internship and Job may be offered based on internship Performance. ");
          break;
        case "L3":
          System.out.println("Congrats " + N + " You selected for selected for Full time internship and Job may be offered based on internship Performance. ");
          break;
        case "L4":
          System.out.println("Congrats " + N + " You selected for Part time intership of 21 days.");
          break;
        case "L5":
          System.out.println("Congrats " + N + " You selected for Part time intership of 21 days.");
          break;
        default:
          System.out.println("Invalid");
      }
    }
  }
}
