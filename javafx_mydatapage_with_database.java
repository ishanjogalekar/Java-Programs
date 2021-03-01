package Application;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.input.*;
import java.sql.*;
public class Mypage extends Application{
 public void start(Stage s){
 // Creating text,textField,submit button
 Text text1=new Text("Name");
 Text text2=new Text("Relationship");
 Text text3=new Text("Date of birth");
 Text text4=new Text("Favourite colour");
 Text text5=new Text("Favourite place");
 Text text6=new Text("Phone no");
 Text text7=new Text("Family members");
 TextField textField1=new TextField();
 TextField textField2=new TextField();
 TextField textField3=new TextField();
 TextField textField4=new TextField();
 TextField textField5=new TextField();
 TextField textField6=new TextField();
 TextField textField7=new TextField();
 Button btn1=new Button("Submit");
 //Event Handler
 EventHandler<MouseEvent> eventhandler= new
EventHandler<MouseEvent>() {
 public void handle(MouseEvent e){
 String a1=textField1.getText();
 String a2=textField2.getText();
 String a3=textField3.getText();
 String a4=textField4.getText();
 String a5=textField5.getText();
 String a6=textField6.getText();
 String a7=textField7.getText();
 System.out.println("Name:"+" "+a1);
 System.out.println("Relationship:"+" "+a2);
 System.out.println("Date of birth:"+" "+a3);
 System.out.println("Favourite colour:"+" "+a4);
 System.out.println("Favourite place:"+" "+a5);
 System.out.println("Phone no:"+" "+a6);
 System.out.println("Family members:"+" "+a7);
 // Connection to oracle database
 try{
 Class.forName("oracle.jdbc.driver.OracleDriver");
 String conURL =
"jdbc:oracle:thin:@localhost:1521:xe";
 String user = "System";
 String pass = "Pass123";
 Connection con =
DriverManager.getConnection(conURL, user, pass);
 Statement stmt=con.createStatement();
 // SQL Query for database
 String Qs="insert into MyFamilyInfo_19BCE2250
values('"+a1+"','"+a2+"', '"+a3+"', '"+a4+"', '"+a5+"',
'"+a6+"','"+a7+"') ";
 ResultSet rs=stmt.executeQuery(Qs);
 }
 catch(Exception exe) {
 System.out.println("Exception caught");
 }
 System.out.println("\n");
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 String conURL =
"jdbc:oracle:thin:@localhost:1521:xe";
 String user = "System";
 String pass = "Pass123";
 Connection con =
DriverManager.getConnection(conURL, user, pass);
 Statement stmt = con.createStatement();
 ResultSet rs = stmt.executeQuery("select *from
MyFamilyInfo_19BCE2250");
 while (rs.next()) {
 System.out.println(rs.getString(1) + " " +
rs.getString(2) + " " + rs.getString(3)+" "+rs.getString(4)+"
"+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
 }
 con.close();
 }
 catch (Exception exe){ System.out.println(exe);}
 }
 };

btn1.addEventFilter(MouseEvent.MOUSE_CLICKED,eventhan
dler);
 GridPane gridPane=new GridPane();
 gridPane.add(text1,0,0); //Text1& textField1
 gridPane.add(textField1,1,0);
 gridPane.add(text2,0,2); //Text2& textField2
 gridPane.add(textField2,1,2);
 gridPane.add(text3,0,4); //Text3& textField3
 gridPane.add(textField3,1,4);
 gridPane.add(text4,0,6); //Text4& textField4
 gridPane.add(textField4,1,6);
 gridPane.add(text5,0,8); //Text5& textField5
 gridPane.add(textField5,1,8);
 gridPane.add(text6,0,10); //Text6& textField6
 gridPane.add(textField6,1,10);
 gridPane.add(text7,0,12); //Text7& textField7
 gridPane.add(textField7,1,12);
 gridPane.add(btn1,0,15); // Button
 gridPane.setHgap(10);
 gridPane.setVgap(10);
 Scene scene=new Scene(gridPane);
 s.setScene(scene);
 s.setTitle("19BCE2250- My Page");
 s.show();
 }
 public static void main(String[] args) {

 System.out.println("\n");
 launch(args);
 }
}
