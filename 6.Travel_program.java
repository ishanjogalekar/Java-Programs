/*Question - 
Define an abstract class called Travel [defined in package1] with few appropriate data members and methods for getting and displaying the same, create two subclasses called “InternationalTravel” and “NationalTravel” with new necessary data members respectively. 
Create at least three objects for both of the subclasses and just display the info in  package2 based on your travel experience so far. 
Also create a method which scans the places which you would like to travel along with tentative year, in which you may travel and display that as well.
*/

//Code -
// 1.package1 :-
package package1;
import java.util.Scanner;
public class Class1_19BCE2250 { public static void T()
{ International s1 = new International();
    National s2 = new National();
    
    System.out.println("\n");
    System.out.println("Enter Your International Travel Details Details");
    s1.getData();
    System.out.println("Your Details are: ");
    s1.printData();
    int i = 0;
    while (i < 2) {
        System.out.println("\nEnter International Travel Details: ");
        s1.Interget();
        i++;
    }
    System.out.println("\nEnter Your National Travel Details");
    s2.getData();
    System.out.println("Your Details are: ");
    s2.printData();
    int j = 0;
    while (j < 2)
    {
        System.out.println("\nEnter National Travel details: ");
        s2.Natget();
        j++;
    }
}
}
// Creating Abstract 
class abstract class Travel {
    String country_name, city, place, date;
    //Method to get data
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Country: ");
        country_name = sc.nextLine();
        System.out.println("Enter City: ");
        city = sc.nextLine();
        System.out.println("Enter Place: ");
        place = sc.nextLine();
        System.out.println("Enter Date : ");
        date = sc.nextLine();
    }
    //Method to print data 
    void printData()
    {
        System.out.println("Country You visited: "+" "+country_name);
        System.out.println("City You visited: "+" "+city);
        System.out.println("Place You visited:"+" "+place);
        System.out.println("Date: "+date);
    }
} //Sub-class 1 
class International extends Travel {
    @Override
    void getData()
    {
        super.getData();
    }
    @Override void printData()
    {
        super.printData();
    }
    void Interget()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter country name: ");
        String c=s.nextLine();
        System.out.println("Enter city name: ");
        String ci=s.nextLine();
        System.out.println("Enter date: ");
        String d=s.nextLine();
        System.out.println("Your International Travel Details: ");
        System.out.println("You visited "+c+","+ci+" on "+d);
    }
}
//Sub-class 2 
class National extends Travel {
    @Override
    void getData()
    {
        super.getData();
    }
    @Override
    void printData()
    {
        super.printData();
    }
    void Natget()
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter city you visited in India: ");
        String city_India = a.nextLine(); System.out.println("Enter Place: ");
        String p_India=a.nextLine(); System.out.println("Enter Date: ");
        String d_India = a.nextLine();
        System.out.println("Your National Travel Details: ");
        System.out.println("You visited" + city_India +","+p_India+ " on " + d_India);
    }
}

//2.package2 :-
        package package2;
import package1.*;
import java.util.Scanner;
public class Class2_19BCE2250
{
    public static void main(String[] args)
    {
        Class1_19BCE2250.T();
        Class2_19BCE2250.wish();
    }
    public static void wish() {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter Country which you want to visit: ");
        String wc = b.nextLine();
        System.out.println("Tentative Date: ");
        String wd = b.nextLine();
        System.out.println("You want to visit " + wc + " on " + wd);
    }
}
