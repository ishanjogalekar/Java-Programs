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
} else {
System.out.println("Enter Your Branch and University");
String B = s.nextLine();
String U = s.nextLine();
System.out.println("Enter Condition as:");
String L = s.next();
switch (L) {
case "L1":
System.out.println("Congrats " + N + " You selected
for Full time internship and Full time job");
break;
case "L2":
System.out.println("Congrats " + N + " You selected
for selected for Full time internship and Job may be offered
based on internship Performance. ");
break;
case "L3":
System.out.println("Congrats " + N + " You selected
for selected for Full time internship and Job may be offered
based on internship Performance. ");
break;
case "L4":
System.out.println("Congrats " + N + " You selected
for Part time intership of 21 days.");
break;
case "L5":
System.out.println("Congrats " + N + " You selected
for Part time intership of 21 days.");
break;
default:
System.out.println("Invalid");
}
}
}
}
