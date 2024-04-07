package org.example;
import java.util.Random;

public class SETUP {
    public static int[][] setup(int[] boardrules,int[][] visiblegrid) {
        //initialise gamefield variable, used to mine layout
        int[][] gamefield = new int[boardrules[0]][boardrules[1]];
        //assign mine, denoted by int 100 to a random x, y coordinate in gamefield
        int iteration = boardrules[2];
        for (int i = 0; i < iteration; i++) {
            Random random = new Random();
            int x = random.nextInt(boardrules[2]-1);
            int y = random.nextInt(boardrules[2]-1);
            if (visiblegrid[x][y] != 50) {
                gamefield[x][y] = 100; //100 in an array position denotes mine in board layout
            } else {iteration++;}
        }
        //use gamefield, with parsed mine locations to set up mine indicators
        gamefield = MineField.minefield(boardrules, gamefield);
        //return updated gamefield array
        return gamefield;
    }}
