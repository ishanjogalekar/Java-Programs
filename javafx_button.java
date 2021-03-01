package Application;
// 19BCE2250 Ishan Sagar Jogalekar
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class ButtonApp extends Application {
 public void start(Stage s) throws Exception {
 Button btn1 = new Button();
 btn1.setText("Red");
 Button btn2 = new Button();
 btn2.setText("Green");
 Button btn3 = new Button();
 btn3.setText("Pink");
 Button btn4 = new Button();
 btn4.setText("Blue");
 Button btn5 = new Button();
 btn5.setText("Black");
 btn1.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println("Red");
 }
 });
 btn2.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println("Green");
 }
 });
 btn3.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println("pink");
 }
 });
 btn4.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println("Blue");
 }
 });
 btn5.setOnAction(new EventHandler<ActionEvent>() {
 @Override
 public void handle(ActionEvent event) {
 System.out.println("Black");
 }
 });
 Pane root = new Pane();
 btn1.setLayoutX(10);
 btn1.setLayoutY(50);
 root.getChildren().add(btn1);
 btn2.setLayoutX(10);
 btn2.setLayoutY(100);
 root.getChildren().add(btn2);
 btn3.setLayoutX(10);
 btn3.setLayoutY(150);
 root.getChildren().add(btn3);
 btn4.setLayoutX(10);
 btn4.setLayoutY(200);
 root.getChildren().add(btn4);
 btn5.setLayoutX(10);
 btn5.setLayoutY(250);
 root.getChildren().add(btn5);
 s.setScene(new Scene(root, 400, 400));
 s.setTitle("19BCE2250 Ishan Sagar Jogalekar");
 s.show();
 }
 public static void main (String[] args)
 {

 launch(args);
 }
}
