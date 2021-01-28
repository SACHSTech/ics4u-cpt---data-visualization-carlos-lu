package Datasets;

import Datasets.*;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.Scanner;

import javafx.scene.Parent;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jdk.incubator.jpackage.internal.Arguments;
import javafx.scene.Group;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

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
    public static int intGames;

    int X = 600;
    int Y = 600;
    Font font = Font.font("Times New Roman");

    //run 
    public static void main(String[] args) throws IOException {

        //set Scanner for CSV file
        Scanner gamesCSV = new Scanner(new File("src/Datasets/games-features.csv"));
        gamesCSV.useDelimiter("[,\n]"); //pattern use , to seperate

        //read till the last line
        while (gamesCSV.hasNext() != false) {
            gamesCSV.next();;
            intCounter++;
        }

        string = new String[intCounter]; //Exactly how many strings there are.

        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/games-features.csv")); //reopen file
        gamesCSV.useDelimiter("[,\n]"); //pattern use , to seperate

        for (int intCount = 0; intCount < intCounter; intCount++) {
            string[intCount] = gamesCSV.next(); // String array
        }
        
        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/games-features.csv")); //reopen file
        gamesCSV.useDelimiter("[,\n]"); //pattern use , to seperate

        intGames = intCounter / 78 - 1; // Total of (usable) items in CSV file
        Games = new games[intGames]; //set list 

        gamesCSV.close(); // Games Object created, CSV file close.

        for (int intCount = 1; intCount <= intGames; intCount++) {
            Games[intCount-1] = new games(string[intCount*78], string[intCount*78+1], string[intCount*78+2], string[intCount*78+3], string[intCount*78+4], string[intCount*78+5], string[intCount*78+6], string[intCount*78+7], string[intCount*78+8], string[intCount*78+9], string[intCount*78+10], string[intCount*78+11], string[intCount*78+12], string[intCount*78+13], string[intCount*78+14], string[intCount*78+15], string[intCount*78+16],  string[intCount*78+17], string[intCount*78+18], string[intCount*78+19], string[intCount*78+20], string[intCount*78+21], string[intCount*78+22], string[intCount*78+23], string[intCount*78+24], string[intCount*78+25], string[intCount*78+26], string[intCount*78+27], string[intCount*78+28], string[intCount*78+29], string[intCount*78+30], string[intCount*78+31], string[intCount*78+32], string[intCount*78+33], string[intCount*78+34], string[intCount*78+35], string[intCount*78+36], string[intCount*78+37],string[intCount*78+38], string[intCount*78+39], string[intCount*78+40], string[intCount*78+41], string[intCount*78+42], string[intCount*78+43], string[intCount*78+44], string[intCount*78+45], string[intCount*78+46], string[intCount*78+47], string[intCount*78+47], string[intCount*78+48], string[intCount*78+49], string[intCount*78+50], string[intCount*78+51], string[intCount*78+52], string[intCount*78+53], string[intCount*78+54], string[intCount*78+55], string[intCount*78+56], string[intCount*78+57], string[intCount*78+58], string[intCount*78+59], string[intCount*78+60], string[intCount*78+61], string[intCount*78+62], string[intCount*78+63], string[intCount*78+64], string[intCount*78+65], string[intCount*78+66], string[intCount*78+67], string[intCount*78+68], string[intCount*78+69], string[intCount*78+70], string[intCount*78+71], string[intCount*78+72], string[intCount*78+73], string[intCount*78+74], string[intCount*78+75], string[intCount*78+76]);
        } // String array to object method

        /*
         * Rest of the things are just search and sort, except there are nothing to sort
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
    
    public Scene createMenu() {
        Menu menu1 = new Menu("Display");
        CheckMenuItem dataSetCheck = new CheckMenuItem("Datasets");
        MenuBar menuBar = new MenuBar();
        
        menu1.getItems().add(dataSetCheck);

        menuBar.getMenus().add(menu1);
        menuBar.setTranslateX(525);
        menuBar.setTranslateY(20);

        Group gMenu = new Group(menuBar);
        Scene sMenu = new Scene(gMenu, 20, 20);

        return sMenu;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        //PrimaryStage settings
        primaryStage.setTitle("Data Visulization");
        primaryStage.setResizable(false);
        //Setting title
        Text text = new Text("Data Visulization CPT");
        text.setFont(Font.font("Times New Roman",40));
        text.setTranslateX(100);
        text.setTranslateY(-120);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();

        //buttons in primary Stage
        Button btn1 = new Button();
        btn1.setText("Show Bar Chart");
        btn1.setPrefSize(200, 20);
        btn1.setTranslateX(175);
        btn1.setTranslateY(100);
        btn1.setFont(font);
        Button btn2 = new Button();
        btn2.setText("Show Pie Chart");
        btn2.setPrefSize(200, 20);
        btn2.setTranslateX(175);
        btn2.setTranslateY(125);
        btn2.setFont(font);
        Button btn4 = new Button();
        btn4.setText("Show Top 100 Games in Console");
        btn4.setPrefSize(200, 20);
        btn4.setTranslateX(175);
        btn4.setTranslateY(150);
        btn4.setFont(font);
        Button btn5 = new Button();
        btn5.setText("Show Summary Of Data");
        btn5.setPrefSize(200, 20);
        btn5.setTranslateX(175);
        btn5.setTranslateY(175);
        btn5.setFont(font);

        primaryStage.hide();
        primaryStage.show();
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {   

                CategoryAxis xaxis = new CategoryAxis();  
                NumberAxis yaxis = new NumberAxis(0,1210,10);  
                xaxis.setLabel("Genre");  
                yaxis.setLabel("Total Games");  
            
                BarChart<String,Float> bar = new BarChart(xaxis,yaxis);  
                bar.setTitle("Top Selling Games Of 2020 / Genres Split");
                  
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

                Slider slider = new Slider();
                slider.setMin(0);
                slider.setMax(100);
                slider.setValue(40);
                slider.setShowTickLabels(true);
                slider.setShowTickMarks(true);
                slider.setMajorTickUnit(50);
                slider.setMinorTickCount(5);
                slider.setBlockIncrement(10);
                
                Button btn3 = new Button();
                btn3.setText("Back");
                btn3.setPrefSize(100, 20);
                btn3.setTranslateY(500);
                VBox Vbox = new VBox();
                Vbox.setPadding(new Insets(15, 12, 15, 12));
                Vbox.setSpacing(10);
                Vbox.getChildren().addAll(btn3, slider);
                btn3.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent arg0) {
                    VBox Vbox = new VBox();
                    Vbox.setPadding(new Insets(15, 12, 15, 12));
                    Vbox.setSpacing(10);
                    Vbox.getChildren().addAll(btn1,btn2,btn4,btn5,text);
                    primaryStage.setScene(new Scene(Vbox, 600, 500));
                    primaryStage.setTitle("Data Visulization");
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
					primaryStage.setTitle("Most Popular Games Over the Decade / PieChart");
                    primaryStage.setWidth(X);
                    primaryStage.setHeight(Y);
             
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
                    chart.setTitle("Most popular games over a decade");
                    chart.setClockwise(false);

                    chart.getData().forEach(data -> {
                        String percentage = String.format("%.2f%%", (data.getPieValue() / 100));
                        Tooltip toolTip = new Tooltip(percentage);
                        Tooltip.install(data.getNode(), toolTip);
                    });

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
                Vbox.getChildren().addAll(btn1,btn2,btn4,btn5,text);
                primaryStage.setScene(new Scene(Vbox, 600, 500));
                primaryStage.setTitle("Data Visulization");
                primaryStage.show();
                }
            

            });
        
                ((Group) scene.getRoot()).getChildren().addAll(chart,btn3);
                primaryStage.setScene(scene);
            }
        });
    btn4.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            for(int intcounter = 0;intcounter < 100;intcounter++){
                System.out.println(Games[intcounter].getQueryName());
            }
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                    Text sum = new Text("Total number of games: 13355");
                    Text game = new Text("Top game: Counter Strike/Bottom Game: Ghostlight Manor");
                    Text aver = new Text("Average Price: 8.80 USD");
                    Button btn3 = new Button();
                    btn3.setText("Back");
                    btn3.setPrefSize(100, 20);
                    btn3.setTranslateX(10);
                    btn3.setTranslateY(300);
                    VBox Vbox = new VBox();
                    Vbox.setPadding(new Insets(15, 12, 15, 12));
                    Vbox.setSpacing(10);
                    Vbox.getChildren().addAll(sum, btn3, game);
                    
                    primaryStage.setScene(new Scene(Vbox, 600, 500));
                    primaryStage.setTitle("Data Visulization");
                    primaryStage.show();
                    btn3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent arg0) {
                    VBox Vbox = new VBox();
                    Vbox.setPadding(new Insets(15, 12, 15, 12));
                    Vbox.setSpacing(10);
                    Vbox.getChildren().addAll(btn1,btn2,btn4,btn5,text);
                    primaryStage.setScene(new Scene(Vbox, 600, 500));
                    primaryStage.setTitle("Data Visulization");
                    primaryStage.show();
                }
                });
            }
            });
        VBox Vbox = new VBox();
        Vbox.setPadding(new Insets(15, 12, 15, 12));
        Vbox.setSpacing(10);
        Vbox.getChildren().addAll(btn1,btn2,btn4,btn5,text);
        primaryStage.setScene(new Scene(Vbox, 600, 500));
        primaryStage.setTitle("Data Visulization");
        primaryStage.show();
    }

    
    
}