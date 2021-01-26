package Datasets;

import Datasets.*;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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

/*
 * This is the main program that's going to read through the CSV file then put them in games.java to make them objects, just for cleanliness.
 * 
 * It 
 */

public class NumberOfGames extends Application{
    //run 
    public static void main(String[] args) throws IOException {
        
        int intCounter = 0;
        String[] string;

        //set Scanner for CSV file
        Scanner gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv"));
        gamesCSV.useDelimiter("[,\n]"); //pattern use , to seperate

        //read till the last line
        while (gamesCSV.hasNext() != false) {
            gamesCSV.next();;
            intCounter++;
        }

        string = new String[intCounter]; //Exactly how many strings there are.

        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv")); //reopen file
        gamesCSV.useDelimiter("[,\n]"); //pattern use , to seperate

        for (int intCount = 0; intCount < intCounter; intCount++) {
            string[intCount] = gamesCSV.next(); // String array
        }
        
        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv")); //reopen file
        gamesCSV.useDelimiter("[,\n]"); //pattern use , to seperate

        int intGames = intCounter / 77 - 1; // Total of (usable) items in CSV file
        games[] Games = new games[intGames]; //set list 

        for (int intCount = 1; intCount <= intGames; intCount++) {
            Games[intCount-1] = new games(string[intCount*77], string[intCount*77+1], string[intCount*77+2], string[intCount*77+3], string[intCount*77+4], string[intCount*77+5], string[intCount*77+6], string[intCount*77+7], string[intCount*77+8], string[intCount*77+9], string[intCount*77+10], string[intCount*77+11], string[intCount*77+12], string[intCount*77+13], string[intCount*77+14], string[intCount*77+15], string[intCount*77+16],  string[intCount*77+17], string[intCount*77+18], string[intCount*77+19], string[intCount*77+20], string[intCount*77+21], string[intCount*77+22], string[intCount*77+23], string[intCount*77+24], string[intCount*77+25], string[intCount*77+26], string[intCount*77+27], string[intCount*77+28], string[intCount*77+29], string[intCount*77+30], string[intCount*77+31], string[intCount*77+32], string[intCount*77+33], string[intCount*77+34], string[intCount*77+35], string[intCount*77+36], string[intCount*77+37],string[intCount*77+38], string[intCount*77+39], string[intCount*77+40], string[intCount*77+41], string[intCount*77+42], string[intCount*77+43], string[intCount*77+44], string[intCount*77+45], string[intCount*77+46], string[intCount*77+47], string[intCount*77+47], string[intCount*77+48], string[intCount*77+49], string[intCount*77+50], string[intCount*77+51], string[intCount*77+52], string[intCount*77+53], string[intCount*77+54], string[intCount*77+55], string[intCount*77+56], string[intCount*77+57], string[intCount*77+58], string[intCount*77+59], string[intCount*77+60], string[intCount*77+61], string[intCount*77+62], string[intCount*77+63], string[intCount*77+64], string[intCount*77+65], string[intCount*77+66], string[intCount*77+67], string[intCount*77+68], string[intCount*77+69], string[intCount*77+70], string[intCount*77+71], string[intCount*77+72], string[intCount*77+73], string[intCount*77+74], string[intCount*77+75], string[intCount*77+76]);
        }

        gamesCSV.close(); // Games Object created, CSV file not needed.
        System.out.println(Games[1].getWebsite());

        /*
         * Rest of the things are just sorting
         */

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