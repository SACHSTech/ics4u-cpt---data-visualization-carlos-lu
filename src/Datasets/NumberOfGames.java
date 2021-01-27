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

    public static int intCounter = 0;
    public static String[] string;
    public static int[] intGamesCount;
    public static games[] Games;

    //run 
    public static void main(String[] args) throws IOException {

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

        int intGames = intCounter / 78 - 1; // Total of (usable) items in CSV file
        Games = new games[intGames]; //set list 

        gamesCSV.close(); // Games Object created, CSV file close.
        System.out.println(string[78]);

        for (int intCount = 1; intCount <= intGames; intCount++) {
            Games[intCount-1] = new games(string[intCount*78], string[intCount*78+1], string[intCount*78+2], string[intCount*78+3], string[intCount*78+4], string[intCount*78+5], string[intCount*78+6], string[intCount*78+7], string[intCount*78+8], string[intCount*78+9], string[intCount*78+10], string[intCount*78+11], string[intCount*78+12], string[intCount*78+13], string[intCount*78+14], string[intCount*78+15], string[intCount*78+16],  string[intCount*78+17], string[intCount*78+18], string[intCount*78+19], string[intCount*78+20], string[intCount*78+21], string[intCount*78+22], string[intCount*78+23], string[intCount*78+24], string[intCount*78+25], string[intCount*78+26], string[intCount*78+27], string[intCount*78+28], string[intCount*78+29], string[intCount*78+30], string[intCount*78+31], string[intCount*78+32], string[intCount*78+33], string[intCount*78+34], string[intCount*78+35], string[intCount*78+36], string[intCount*78+37],string[intCount*78+38], string[intCount*78+39], string[intCount*78+40], string[intCount*78+41], string[intCount*78+42], string[intCount*78+43], string[intCount*78+44], string[intCount*78+45], string[intCount*78+46], string[intCount*78+47], string[intCount*78+47], string[intCount*78+48], string[intCount*78+49], string[intCount*78+50], string[intCount*78+51], string[intCount*78+52], string[intCount*78+53], string[intCount*78+54], string[intCount*78+55], string[intCount*78+56], string[intCount*78+57], string[intCount*78+58], string[intCount*78+59], string[intCount*78+60], string[intCount*78+61], string[intCount*78+62], string[intCount*78+63], string[intCount*78+64], string[intCount*78+65], string[intCount*78+66], string[intCount*78+67], string[intCount*78+68], string[intCount*78+69], string[intCount*78+70], string[intCount*78+71], string[intCount*78+72], string[intCount*78+73], string[intCount*78+74], string[intCount*78+75], string[intCount*78+76]);
        } // String array to object method

        System.out.println(Games[1].getQueryName());

        /*
         * Rest of the things are just search and sort
         */

        intGamesCount = new int[13];
        for (int intCount = 0; intCount < intGames; intCount++) {
            if (Games[intCount].getGenreIsAction() == true) {
                intGamesCount[0]++; // 0 is action
            }else if (Games[intCount].getGenreIsAdventure() == true){
                intGamesCount[1]++; // 1 is Adventure
            }else if (Games[intCount].getGenreIsCasual() == true){
                intGamesCount[2]++; // 2 is Casual
            }else if (Games[intCount].getGenreIsEarlyAccess() == true){
                intGamesCount[3]++; // 3 is EarlyAccess
            }else if (Games[intCount].getGenreIsFreeToPlay() == true){
                intGamesCount[4]++; // 4 is free to play
            }else if (Games[intCount].getGenreIsIndie() == true){
                intGamesCount[5]++; // 5 is indie
            }else if (Games[intCount].getGenreIsMassivelyMultiplayer() == true){
                intGamesCount[6]++; // 6 is MassivelyMultiplayer
            }else if (Games[intCount].getGenreIsNonGame() == true){
                intGamesCount[7]++; // 7 is nongame
            }else if (Games[intCount].getGenreIsRPG() == true){
                intGamesCount[8]++; // 8 is RPG
            }else if (Games[intCount].getGenreIsRacing() == true){
                intGamesCount[9]++; // 9 is Racing
            }else if (Games[intCount].getGenreIsSimulation() == true){
                intGamesCount[10]++; // 10 is Simulation
            }else if (Games[intCount].getGenreIsSports() == true){
                intGamesCount[11]++; // 11 is sports
            }else if (Games[intCount].getGenreIsStrategy() == true){
                intGamesCount[12]++; // 12 is Strategy
            }
        }

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

                CategoryAxis xaxis = new CategoryAxis();  
                NumberAxis yaxis = new NumberAxis(0,70,10);  
                xaxis.setLabel("Genre");  
                yaxis.setLabel("Total Games Sold");  
            
                BarChart<String,Float> bar = new BarChart(xaxis,yaxis);  
                bar.setTitle("Top Selling Games Of 2020");  
                  
                //Configuring Series for XY chart   
                XYChart.Series<String,Float> series = new XYChart.Series<>();  
                series.getData().add(new XYChart.Data("NonGame", intGamesCount[7]));  
                series.getData().add(new XYChart.Data("Indie", intGamesCount[5]));  
                series.getData().add(new XYChart.Data("Action", intGamesCount[0]));  
                series.getData().add(new XYChart.Data("Adventure", intGamesCount[1]));
                series.getData().add(new XYChart.Data("Casual", intGamesCount[2]));  
                series.getData().add(new XYChart.Data("Strategy", intGamesCount[12]));  
                series.getData().add(new XYChart.Data("RPG", intGamesCount[8]));
                series.getData().add(new XYChart.Data("Simulation", intGamesCount[10]));  
                series.getData().add(new XYChart.Data("EarlyAccess", intGamesCount[3]));  
                series.getData().add(new XYChart.Data("FreeToPlay", intGamesCount[4]));  
                series.getData().add(new XYChart.Data("Sports", intGamesCount[11]));  
                series.getData().add(new XYChart.Data("Racing", intGamesCount[9]));
                series.getData().add(new XYChart.Data("MassivelyMultiplayer", intGamesCount[6]));      
                  
             
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
                            new PieChart.Data("NonGame", intGamesCount[7]),
                            new PieChart.Data("Indie", intGamesCount[5]),
                            new PieChart.Data("Action", intGamesCount[0]),
                            new PieChart.Data("Adventure", intGamesCount[2]),
                            new PieChart.Data("Casual", intGamesCount[12]),
                            new PieChart.Data("Strategy", intGamesCount[8]),
                            new PieChart.Data("RPG", intGamesCount[10]),
                            new PieChart.Data("Simulation", intGamesCount[3]),
                            new PieChart.Data("EarlyAccess", intGamesCount[4]),
                            new PieChart.Data("FreeToPlay", intGamesCount[11]),
                            new PieChart.Data("Sports", intGamesCount[9]),
                            new PieChart.Data("Racing", intGamesCount[6]),
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