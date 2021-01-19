/* ....Show License.... */
package charts;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.BarChart;  
import javafx.scene.chart.CategoryAxis;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;  
public class BarChartApp extends Application {  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    //Defining string to label XAxis   
    String NonGame = "NonGame";  
    String Indie = "Indie";  
    String Action = "Action";  
    String Adventure = "Adventure";  
    String Casual = "Casual";
    String Strategy = "Strategy";
    String RPG = "RPG";
    String Simulation = "Simulation";
    String EarlyAccess = "EarlyAccess";
    String FreeToPlay = "FreeToPlay";
    String Sports = "Sports";
    String Racing = "Racing";
    String MassivelyMultiplayer = "MassivelyMultiplayer";
      
    //Configuring category and NumberAxis   
    CategoryAxis xaxis= new CategoryAxis();  
    NumberAxis yaxis = new NumberAxis(0,200,10);  
    xaxis.setLabel("Genre");  
    yaxis.setLabel("Total Games Sold");  
      
    //Configuring BarChart   
    BarChart<String,Float> bar = new BarChart(xaxis,yaxis);  
    bar.setTitle("Dollar Conversion chart");  
      
    //Configuring Series for XY chart   
    XYChart.Series<String,Float> series = new XYChart.Series<>();  
    series.getData().add(new XYChart.Data(NonGame,00));  
    series.getData().add(new XYChart.Data(Indie,00));  
    series.getData().add(new XYChart.Data(Action,00));  
    series.getData().add(new XYChart.Data(Adventure,00));
    series.getData().add(new XYChart.Data(Casual,00));  
    series.getData().add(new XYChart.Data(Strategy,00));  
    series.getData().add(new XYChart.Data(RPG,00));
    series.getData().add(new XYChart.Data(Simulation,00));  
    series.getData().add(new XYChart.Data(EarlyAccess,00));  
    series.getData().add(new XYChart.Data(FreeToPlay,00));  
    series.getData().add(new XYChart.Data(Sports,00));  
    series.getData().add(new XYChart.Data(Racing,00));
    series.getData().add(new XYChart.Data(MassivelyMultiplayer,00));      
      
    //Adding series to the barchart   
    bar.getData().add(series);  
      
    // configuring group and scene   
    Group root = new Group();  
    root.getChildren().add(bar);  
    Scene scene = new Scene(root,600,400);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("BarChart Example");  
    primaryStage.show();      
}  
public static void main(String[] args) {  
    launch(args);  
}  
}  