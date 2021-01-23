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

public class NumberOfGames {
    //run 
    public static void main(String[] args) throws IOException {
        
        //String Variables
        int intCounter = 0;
        String[] string;

        //set bufferReader for CSV file
        Scanner gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv"));

        gamesCSV.useDelimiter(","); //pattern use , to seperate

        //read till the last line
        while (gamesCSV.hasNext() == true) {
            intCounter++;
            System.out.println(gamesCSV.next());
        }

        string = new String[intCounter]; //Exactly how many strings there are.

        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv")); //reopen file

        games[] topSellgames = new games[intCounter];
        for (int intCount = 0; intCount < intCounter; intCount++) {
            string[intCount] = gamesCSV.next();
        }
        
        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv")); //reopen file

        intCounter = intCounter / 77; // There are 77 private variables in a line in csv file

        for (int intCount = 0; intCount < intCounter; intCount++) {
            topSellgames[intCount] = topSellgames(string[intCount], string[intCount+1], string[intCount+2], string[intCount+3], string[intCount+4], string[intCount+5], string[intCount+6], string[intCount+7], string[intCount+8], string[intCount+9], string[intCount+10], string[intCount+11], string[intCount+12], string[intCount+13], string[intCount+14], string[intCount+15], string[intCount+16],  string[intCount+17], string[intCount+18], string[intCount+19], string[intCount+20], string[intCount+21], string[intCount+22], string[intCount+23], string[intCount+24], string[intCount+25], string[intCount+26], string[intCount+27], string[intCount+28], string[intCount+29], string[intCount+30], v string[intCount+31], string[intCount+32], string[intCount+33], string[intCount+34], string[intCount+35], string[intCount+36], string[intCount+37],string[intCount+38], string[intCount+39], string[intCount+40], string[intCount+41], string[intCount+42], string[intCount+43], string[intCount+44], string[intCount+45], string[intCount+46], string[intCount+47], string[intCount+47], string[intCount+48], string[intCount+49], string[intCount+50], string[intCount+51], string[intCount+52], string[intCount+53], string[intCount+54], string[intCount+55], string[intCount+56], string[intCount+57], string[intCount+58], string[intCount+59], string[intCount+60], string[intCount+61], string[intCount+62], string[intCount+63], string[intCount+64], string[intCount+65], string[intCount+66], string[intCount+67], string[intCount+68], string[intCount+69], string[intCount+70], string[intCount+71], string[intCount+72], string[intCount+73], string[intCount+74], string[intCount+75], string[intCount+76]);
        }
    }
}