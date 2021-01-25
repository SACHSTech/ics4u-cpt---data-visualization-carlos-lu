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

        games[] Games = new games[intCounter];
        for (int intCount = 0; intCount < intCounter; intCount++) {
            string[intCount] = gamesCSV.next();
        }
        
        gamesCSV.close(); //close file
        gamesCSV = new Scanner(new File("src/Datasets/mainGames.csv")); //reopen file

        intCounter = intCounter / 77; // There are 77 private variables in a line in csv file
        intCounter--; //Getting rid of the top.

        for (int intCount = 1; intCount <= intCounter; intCount++) {
            Games[intCount-1] = new games(string[intCount*77], string[intCount*77+1], string[intCount*77+2], string[intCount*77+3], string[intCount*77+4], string[intCount*77+5], string[intCount*77+6], string[intCount*77+7], string[intCount*77+8], string[intCount*77+9], string[intCount*77+10], string[intCount*77+11], string[intCount*77+12], string[intCount*77+13], string[intCount*77+14], string[intCount*77+15], string[intCount*77+16],  string[intCount*77+17], string[intCount*77+18], string[intCount*77+19], string[intCount*77+20], string[intCount*77+21], string[intCount*77+22], string[intCount*77+23], string[intCount*77+24], string[intCount*77+25], string[intCount*77+26], string[intCount*77+27], string[intCount*77+28], string[intCount*77+29], string[intCount*77+30], string[intCount*77+31], string[intCount*77+32], string[intCount*77+33], string[intCount*77+34], string[intCount*77+35], string[intCount*77+36], string[intCount*77+37],string[intCount*77+38], string[intCount*77+39], string[intCount*77+40], string[intCount*77+41], string[intCount*77+42], string[intCount*77+43], string[intCount*77+44], string[intCount*77+45], string[intCount*77+46], string[intCount*77+47], string[intCount*77+47], string[intCount*77+48], string[intCount*77+49], string[intCount*77+50], string[intCount*77+51], string[intCount*77+52], string[intCount*77+53], string[intCount*77+54], string[intCount*77+55], string[intCount*77+56], string[intCount*77+57], string[intCount*77+58], string[intCount*77+59], string[intCount*77+60], string[intCount*77+61], string[intCount*77+62], string[intCount*77+63], string[intCount*77+64], string[intCount*77+65], string[intCount*77+66], string[intCount*77+67], string[intCount*77+68], string[intCount*77+69], string[intCount*77+70], string[intCount*77+71], string[intCount*77+72], string[intCount*77+73], string[intCount*77+74], string[intCount*77+75], string[intCount*77+76]);
        }

    }
}