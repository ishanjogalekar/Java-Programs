/*Question - 
Hostel registration program based on CGPA of student in Java (Multi-threading concepts and file handling with .txt file).
a) Create classes Students and HostelBlocks with necessary details. Store the objects as collections in a File. 
b) Create threads for Hostel_Incharge to allocate rooms based on cgpa. If incharges are trying to allocate the same rooms, handle the situation using inter thread communication. 
*/

//Code - 
package Reg;

import java.util.*;
import java.io.*;


class student implements Serializable{
    String Regno;
    String Name;
    float CGPA;
    int prefroom;
    int allocatedroom;

    student(String Regno,String Name,float CGPA,int prefroom){
        this.Regno=Regno;
        this.Name=Name;
        this.CGPA=CGPA;
        this.prefroom=prefroom;
    }
}

//Room Class
class room implements Serializable{
    int roomno;
    int Size;
    int allotedno;
    room(){Size=2;}
    room(int roomno,int Size){
        this.roomno=roomno;
        this.Size=Size;
        this.allotedno=0;
    }
}

//Warden Class with Thread
class warden extends Thread{
    Hostel B1;
    student[] sortedCGPA=new student[5];
    warden(Hostel B1,student[] sortedCGPA){
        this.B1=B1;
        this.sortedCGPA=sortedCGPA;
    }
    public void run(){
        int b=0;
        try {
            b=B1.Book(sortedCGPA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(b==1){interrupt();}
    }
}

//Hostel Class
class Hostel implements Serializable {
    String BlockName;
    room r[] = new room[2];
    static int booking;

    Hostel(String BlockName, int n) {
        this.BlockName = BlockName;
        for (int i = 0; i < n; i++) {
            r[i] = new room();
        }
        r[0] = new room(101, 2);
        r[1] = new room(102, 2);
    }

    synchronized int Book(student[] sortedCGPA) throws InterruptedException {
        for (student sortedCGPA1 : sortedCGPA) {
            if (sortedCGPA1.allocatedroom == 0) {
                for (room r1 : r) {
                    if ((sortedCGPA1.prefroom == r1.roomno) && (r1.allotedno < r1.Size)) {
                        sortedCGPA1.allocatedroom = sortedCGPA1.prefroom;
                        r1.allotedno = r1.allotedno + 1;
                        booking=booking+1;
                        if(booking==1){
                            wait(); }}
                        if(booking>1&&booking<sortedCGPA.length-2){
                            notifyAll();
                            wait(); }}
                        for (student o1:sortedCGPA){
                            System.out.println("Details: "+" "+o1.Regno+" "+o1.Name+" "+o1.CGPA+" "+o1.prefroom);
                        }
                    }
                }
                if(booking==sortedCGPA.length-1){
                    return 1;
                }
                return 0;
            }
        }



public class registration  {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
       
        //ArrayList
        List<student> stuList=new ArrayList<student>();
        stuList.add(new student("19BCE2010","Rahul",8.62f,101));
        stuList.add(new student("19BCE0210","Ram",9.62f,102));  //Inserting Data
        stuList.add(new student("19BCE1200","Arjun",7.62f,102));



        // Input in file
        FileOutputStream fout=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Reg.txt");
        ObjectOutputStream ob1=new ObjectOutputStream(fout);
        ob1.writeObject(stuList);
        ob1.close();
        System.out.println("Done Writing");

        //Output of file
        FileInputStream fin=new FileInputStream("C:\\Users\\Dell\\Desktop\\Reg.txt");
        ObjectInputStream i1=new ObjectInputStream(fin);
        ArrayList<student> Nlist =new ArrayList<student>();

        //Traversing through List
        while (fin.available()!=0){
            Nlist=(ArrayList<student>)i1.readObject();
        }
        Nlist.sort((o1,o2)->{
            return (int)(o1.CGPA-o2.CGPA);});
            
        Collections.reverse(Nlist);
        Nlist.forEach(o->System.out.println("Details: "+" "+o.Regno+" "+o.Name+" "+o.CGPA+" "+o.prefroom));
        i1.close();
        student[] sortedCGPA=Nlist.toArray(new student[Nlist.size()] );
        //System.out.println(student[0].R);
        Hostel B1=new Hostel ("Block",2);
        warden w1=new warden(B1,sortedCGPA);
        warden w2=new warden(B1,sortedCGPA);
        w1.start();
        w2.start();
        System.out.println("\n");
        System.out.println("Proceeding for result >>.... ");
    }
}
