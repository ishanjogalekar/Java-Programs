//Question - BMI calculator using Java 

//Code - 
// Calculate BMI using Math function in Java
// Find BMI of a person by getting weight and
//height in kg and cm respectively from user. [Formula BMI = kg/m2]

import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        // Scanner function 
        Scanner test=new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        
        float weight=test.nextFloat(); // Input weight
        System.out.println("Enter your height in cm:");
        
        float height=test.nextFloat(); // Input height
        System.out.println("Your weight is "+weight+" kg");
        
        float height_m=height/100; // Convert height in meter
        System.out.println("Your height is in meter is : "+height_m+" m");
       
        double m=Math.pow(height_m,height_m); // Applying formula
        double BMI=weight/m;
        
        //Output BMI 
        System.out.println("Your BMI is "+BMI);
    }
}
