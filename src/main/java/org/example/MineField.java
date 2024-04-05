package org.example;

import javax.swing.*;

public class MineField {
    public static int[][] minefield(int[] boardrules, int[][] gamefield) {
        for (int i = 0; i <boardrules[0];i++){
            for (int j = 0; j <boardrules[1];j++) {
                int numb_mines = 0;
                if(gamefield[i][j]!=100){ 
                    
                    if(i!=0) {
                        if(gamefield[i-1][j]==100) numb_mines++;
                        if(j!=0) {
                            if(gamefield[i-1][j-1]==100) numb_mines++;}

                }
                    if(i!=(boardrules[0]-1)) {
                        if(gamefield[i+1][j]==100) numb_mines++;
                        if(j!=(boardrules[1]-1)) {
                            if(gamefield[i+1][j+1]==100) numb_mines++;}
                }
                    if(j!=0) {
                        if(gamefield[i][j-1]==100) numb_mines++;
                        if(i!=(boardrules[0]-1)) {
                        if(gamefield[i+1][j-1]==100) numb_mines++;}
                }
                    if(j!=(boardrules[1]-1)) {
                        if(gamefield[i][j+1]==100) numb_mines++;
                        if(i!=0) {
                        if(gamefield[i-1][j+1]==100) numb_mines++;}
                }
                gamefield[i][j] = numb_mines;

            }}}
        for (int i = 0; i < boardrules[0]; i++) {
            for (int j = 0; j < boardrules[1]; j++) {
                System.out.print(gamefield[i][j]+" | ");
            }
            System.out.println("");

        }
        return gamefield;


    }}
