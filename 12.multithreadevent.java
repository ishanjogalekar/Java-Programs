/*Question - 
Five events E1, E2, E3, E4 and E5 are going to be organized for Rivera in VIT, registration is open for all B.Tech students. 
With the total strength of 1000 students, simulate the registration for each event by generating 1000 random numbers in the range of 1 – 5.
(1 for event E1, 2 for E2… 5 for E5) and store the values in an array. 
Create six threads to equally share the task of counting the number of registration details for all the events. 
Use synchronized method or synchronized block to update the count variables. 
The main thread should receive the final registration count for all events and display the list of students who have not registered in any event.*/

//Code- 

//Java multi-threading
//Register Class
import java.util.Random;
import java.util.Vector;
public class Register extends Thread {
  Random rand = new Random();
  int m = 750;
  int n = 100;
  int v, s;
  Vector vector;
  public Register(int v, Vector vec) {
    this.v = v;
    this.vector = vec;
  }
  @Override
  public void run() {
  try {
    while (vector.size() < 1000) {
    System.out.println(this.getName() + " is registering");
    vector.add(v);
    s = rand.nextInt((m - n) + 1) + m;
    System.out.println(this.getName() + " is sleeping for " + s);
    Thread.sleep(s);
    }
  } 
    catch { (InterruptedException e) {System.out.println("Not registered: " + e;)}
    }
  }
}


//Count Class
import java.util.Vector;
public class Count extends Thread {
  Vector vector;
  int a;
  public int count = 0;
  public Count(int a, Vector vector) {
    this.a = a;
    this.vector = vector;
  }
  @Override
  public void run() {
  for (int i = 0; i < vector.capacity(); i++) {
    if (vector.elementAt(i).equals(a)) {
      count++;
    }
  }
  }
}

//Main Class
import java.util.Vector;
public class MultiThread {
  public static void main(String[] args) {
    Vector v1 = new Vector(1000);
    Register E1 = new Register(1, v1);
    E1.start();
    Register E2 = new Register(2, v1);
    E2.start();
    Register E3 = new Register(3, v1);
    E3.start();
    Register E4 = new Register(4, v1);
    E4.start();
    Register E5 = new Register(5, v1);
    E5.start();
    try{
      E1.join();
      E2.join();
      E3.join();
      E4.join();
      E5.join();
      System.out.println("Registration has ended!");
    }catch(Exception exc){System.out.println(exc);}
    Count E1E3 = new Count(1, v1);
    Count E2E3 = new Count(2, v1);
    Count E3E3 = new Count(3, v1);
    Count E4E3 = new Count(4, v1);
    Count E5E3 = new Count(5, v1);
    E1E3.start();
    E2E3.start();
    E3E3.start();
    E4E3.start();
    E5E3.start();
    try{
      E1E3.join();
      E2E3.join();
      E3E3.join();
      E4E3.join();
      E5E3.join();
      System.out.println("Counting has ended");
    }catch(Exception e){System.out.println(e);}
    int E1v = E1E3.count;
    int E2v = E2E3.count;
    int E3v = E3E3.count;
    int E4v = E4E3.count;
    int E5v = E5E3.count;
    System.out.println("Registration :" + "\n" + v1);
    System.out.println(E1v + " registered for event 1");
    System.out.println(E2v + " registered for event 2");
    System.out.println(E3v + " registered for event 3");
    System.out.println(E4v + " registered for event 4");
    System.out.println(E5v + " registered for event 5");
  }
}
