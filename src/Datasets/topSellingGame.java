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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * This is the main program that's going to read through the CSV file then put them in games.java to make them objects, just for cleanliness.
 * 
 * It 
 */

public class topSellingGame {
    //run 
    public static void main(String[] args) throws IOException {
        
        int intCounter = 0;

        //set bufferReader for CSV file
        Scanner gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv"));

        gamesCSV.useDelimiter(","); //pattern use , to seperate

        //read till the last line
        while (gamesCSV.hasNext() == true) {
            intCounter++;
            System.out.println(gamesCSV.next());
        }

        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv")); //reopen file

        games[] topSellgames = new games[intCounter];

        for (int intCount = 0; intCount < intCounter; intCount++) {

        }

        
    }
    
}
