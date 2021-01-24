package basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Visulization");
        Button btn1 = new Button();
        btn1.setText("button 1");
        btn1.setPrefSize(100, 20);
        Button btn2 = new Button();
        btn2.setText("button 2");
        btn2.setPrefSize(100, 20);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                //somecode
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //somecode
            }
        });
        VBox Vbox = new VBox();
        Vbox.setPadding(new Insets(15, 12, 15, 12));
        Vbox.setSpacing(10);
        Vbox.getChildren().addAll(btn1,btn2);
        primaryStage.setScene(new Scene(Vbox, 300, 250));
        primaryStage.show();
    }
}