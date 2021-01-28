package charts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
 
public class PieChartSample extends Application {
 
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Total Games sold 2020");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("NonGame", 13),
                new PieChart.Data("Indie", 25),
                new PieChart.Data("Action", 10),
                new PieChart.Data("Adventure", 22),
                new PieChart.Data("Casual", 30),
                new PieChart.Data("Strategy", 21),
                new PieChart.Data("RPG", 23),
                new PieChart.Data("Simulation", 11),
                new PieChart.Data("EarlyAccess", 9),
                new PieChart.Data("FreeToPlay", 10),
                new PieChart.Data("Sports", 29),
                new PieChart.Data("Racing", 24),
                new PieChart.Data("MassivelyMultiplayer", 26));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Total Games sold 2020");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}


