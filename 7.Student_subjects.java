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
public class Regestration {
  public static void main(String[] args) {
    Courses c1 = new Courses("CSE3009","IoT","A1", "TT");
    Courses c2 = new Courses("CSE2001", "CAO", "B1","SJT");
    Courses c3 = new Courses("CSE1002", "C++", "A1","TT");
    Courses c4 = new Courses("CSE1007", "Java", "B1","SJT");
    Student s1 = new Student("19BCE2249","Ram", "VIT");
    Student s2 = new Student("19BEC2250", "Ishan", "VIT");
    s1.printDetails();
    s2.printDetails();
    c1.printDetails(); 
    c2.printDetails();
    c3.printDetails();
    c4.printDetails();
  }
}
class Student
{
  String regNo;
  String name;
  String univName;
  public Student(String regNo, String name, String univName)
  {
    this.regNo = regNo;
    this.name = name;
  }
  public String getRegNo()
  {
    return regNo;
  }
  public String getName()
  {
    return name;
  }
  public String getUnivName()
  {
    return univName;
  }
  public void printDetails()
  {
    System.out.println("Student:-" +"\nregNo='" + regNo + "\nname=" + name);
  }
}
class Courses
{
  String courseCode;
  String name;
  String slot;
  String venue;
  public Courses(String courseCode, String name, String slot,String venue)
  {
    this.courseCode = courseCode;
    this.name = name;
    this.slot = slot;
    this.venue = venue;
  }
  public String getCourseCode()
  {
    return courseCode;
  }
  public String getName()
  {
    return name;
  }
  public String getSlot()
  {
    return slot;
  }
  public String getVenue()
  {
    return venue;
  }
  public void printDetails()
  {
System.out.println("Courses:-" + "\ncourseCode='" +courseCode + "\nname=" + name + "\nslot=" + slot + "\nvenue=" + venue);
  }
}
