public class Regestration {
public static void main(String[] args) {
Courses c1 = new Courses("CSE3009","IoT","A1", "TT");
Courses c2 = new Courses("CSE2001", "CAO", "B1",
"SJT");
Courses c3 = new Courses("CSE1002", "C++", "A1",
"TT");
Courses c4 = new Courses("CSE1007", "Java", "B1",
"SJT");
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
System.out.println("Student{" +
"regNo='" + regNo + '\'' +
", name='" + name + '\'' +
'}');
}
}
class Courses
{
String courseCode;
String name;
String slot;
String venue;
public Courses(String courseCode, String name, String slot,
String venue)
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
System.out.println("Courses{" + "courseCode='" +
courseCode + '\'' +", name='" + name + '\'' + ", slot='" + slot + '\''
+", venue='" + venue + '\'' +'}');
}
}
