/*Question - 
In a family, Mom prepares roti for her children. Mom makes roti and stacks it up in a vessel, and Children eats from it. 
The max capacity of the vessel is 10. If roti empties, Children wait for mom to prepare new roti. 
Develop a program for the given scenario using inter thread communication concept in Java programming. */

//Code - 4 classes each created  (MOM & Child class -> StackVessel Class) . Check for packages names also. 

//StackVessel Class –
package pack1;
import java.util.Stack;
//Creating vessel as stack data structure.
public class stackvessel <T> extends Stack<T> {
  private int maxSize;
  public stackvessel(int s) {
    super();
    this.maxSize = s;
  }
}

//MOM Class
package pack1;
import pack1.stackvessel;
public class MOM implements Runnable {
  private final stackvessel<Integer> SizedStack;
  public MOM(stackvessel<Integer> mySizedStack) {
    this.SizedStack = mySizedStack;
  }
  @Override
  public void run() {
    try {
      for(int i = 1 ; i < 11 ; i++) {
        insertAnElement(i);
      }
    } catch (InterruptedException ex) {System.out.println(ex);}
  }
  public void insertAnElement(int number) throws InterruptedException
  {
    while(SizedStack.size() == 5) {
      synchronized (SizedStack) {
        System.out.println("Vessel is full. MOM is waiting...");
        SizedStack.wait();
      }
    }
    synchronized (SizedStack) {
      SizedStack.push(number);
      SizedStack.notifyAll();
      System.out.println("MOM put Roti in vessel: " + number + " to queue.");
    }
  }
}

//Child Class -
package pack1;
import pack1.stackvessel;
public class Child implements Runnable {
  private final stackvessel<Integer> SS;
  public Child(stackvessel<Integer> mySizedStack) {
    this.SS = mySizedStack;
  }
  @Override
  public void run() {
    while (true) {
      try {
        int element = getAnElementFromQueue();
        System.out.println("Child got the roti: " + element);
      } catch (InterruptedException ex) {System.out.println("There is a problem with child. " + ex.getMessage());}
    }
  }
  public int getAnElementFromQueue() throws
    InterruptedException {
    while (SS.isEmpty()) {
      synchronized (SS) {
        System.out.println("Vessel is empty. Child is waiting...");
        SS.wait();
      }
    }
    synchronized (SS) {
      SS.notifyAll();
      return SS.pop();
    }
  }
}


//Main Class – To run program
package pack1;
import pack1.stackvessel;
public class Main{
  public static void main(String[] args) {
    stackvessel<Integer> mySizedStack = new stackvessel<>(10);
    //Creating threads for MOM and child class each 
    Thread threadProducer = new Thread(new MOM(mySizedStack));
    Thread threadConsumer = new Thread(new Child(mySizedStack));
    threadProducer.start();
    threadConsumer.start();
  }
}
