package basic;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Visulization");
        Button btn1 = new Button();
        btn1.setText("Show Bar Chart");
        btn1.setPrefSize(100, 20);
        Button btn2 = new Button();
        btn2.setText("Show Pie Chart");
        btn2.setPrefSize(100, 20);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {   

                CategoryAxis xaxis= new CategoryAxis();  
                NumberAxis yaxis = new NumberAxis(0,70,10);  
                xaxis.setLabel("Genre");  
                yaxis.setLabel("Total Games Sold");  
            
                BarChart<String,Float> bar = new BarChart(xaxis,yaxis);  
                bar.setTitle("Top Selling Games Of 2020");  
                  
                //Configuring Series for XY chart   
                XYChart.Series<String,Float> series = new XYChart.Series<>();  
                series.getData().add(new XYChart.Data("NonGame",1));  
                series.getData().add(new XYChart.Data("Indie",11));  
                series.getData().add(new XYChart.Data("Action",64));  
                series.getData().add(new XYChart.Data("Adventure",2));
                series.getData().add(new XYChart.Data("Casual",2));  
                series.getData().add(new XYChart.Data("Strategy",22));  
                series.getData().add(new XYChart.Data("RPG",7));
                series.getData().add(new XYChart.Data("Simulation",5));  
                series.getData().add(new XYChart.Data("EarlyAccess",0));  
                series.getData().add(new XYChart.Data("FreeToPlay",2));  
                series.getData().add(new XYChart.Data("Sports",0));  
                series.getData().add(new XYChart.Data("Racing",4));
                series.getData().add(new XYChart.Data("MassivelyMultiplayer",00));      
                  
             
                bar.getData().add(series); 

                Button btn3 = new Button();
                btn3.setText("Back");
                btn3.setPrefSize(100, 20);
                VBox Vbox = new VBox();
                Vbox.setPadding(new Insets(15, 12, 15, 12));
                Vbox.setSpacing(10);
                Vbox.getChildren().addAll(btn3);
                btn3.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent arg0) {
                    VBox Vbox = new VBox();
                    Vbox.setPadding(new Insets(15, 12, 15, 12));
                    Vbox.setSpacing(10);
                    Vbox.getChildren().addAll(btn1,btn2);
                    primaryStage.setScene(new Scene(Vbox, 600, 500));
                    primaryStage.show();
                    }
                 
                    
                });
             
                Group root = new Group();  
                root.getChildren().addAll(bar,btn3);  
                Scene scene = new Scene(root,600,500);  
                primaryStage.setScene(scene);  
                primaryStage.setTitle("BarChart");  
                primaryStage.show();      
            } 
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                    Scene scene = new Scene(new Group());
					primaryStage.setTitle("Total Games sold 2020");
                    primaryStage.setWidth(600);
                    primaryStage.setHeight(500);
             
                    ObservableList<PieChart.Data> pieChartData =
                            FXCollections.observableArrayList(
                            new PieChart.Data("NonGame", 1),
                            new PieChart.Data("Indie", 11),
                            new PieChart.Data("Action", 64),
                            new PieChart.Data("Adventure", 2),
                            new PieChart.Data("Casual", 2),
                            new PieChart.Data("Strategy", 22),
                            new PieChart.Data("RPG", 7),
                            new PieChart.Data("Simulation", 5),
                            new PieChart.Data("EarlyAccess", 0),
                            new PieChart.Data("FreeToPlay", 2),
                            new PieChart.Data("Sports", 0),
                            new PieChart.Data("Racing", 4),
                            new PieChart.Data("MassivelyMultiplayer", 0));
                    final PieChart chart = new PieChart(pieChartData);
                    chart.setTitle("Total Games sold 2020");

                    Button btn3 = new Button();
                btn3.setText("Back");
                btn3.setPrefSize(100, 20);
                VBox Vbox = new VBox();
                Vbox.setPadding(new Insets(15, 12, 15, 12));
                Vbox.setSpacing(10);
                Vbox.getChildren().addAll(btn3);
                btn3.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent arg0) {
                    VBox Vbox = new VBox();
                    Vbox.setPadding(new Insets(15, 12, 15, 12));
                    Vbox.setSpacing(10);
                    Vbox.getChildren().addAll(btn1,btn2);
                    primaryStage.setScene(new Scene(Vbox, 600, 500));
                    primaryStage.show();
                    }
                 
                    
                });
            
                    ((Group) scene.getRoot()).getChildren().addAll(chart,btn3);
                    primaryStage.setScene(scene);
                }
        });
        VBox Vbox = new VBox();
        Vbox.setPadding(new Insets(15, 12, 15, 12));
        Vbox.setSpacing(10);
        Vbox.getChildren().addAll(btn1,btn2);
        primaryStage.setScene(new Scene(Vbox, 600, 500));
        primaryStage.show();
    }
}