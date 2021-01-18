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

public class topSellingGame {
    //run 
    public static void main(String[] args) throws IOException {
        
        int intCounter = 0;

        //set bufferReader for CSV file
        Scanner gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv"));
        String 

        gamesCSV.useDelimiter(","); //pattern use , to seperate

        //read till the last line
        while (gamesCSV.hasNext() == true) {
            intCounter++;
            System.out.println(gamesCSV.next());
        }

        gamesCSV.close(); //close file

        
    }
    
}
