package org.example;

public class MineField {
    public static int[][] minefield(int[] boardrules, int[][] gamefield) {
        //use gamefield array, holding mine positions, to assign adjacent mine counts
        //loop through x-axis n amount of times
        for (int i = 0; i <boardrules[0]; i++){
            //loops through y-axis amount of times
            for (int j = 0; j <boardrules[1];j++) {
                //initiliase variable used to show adjacent mine count
                int numb_mines = 0;
                //if mine present at tile coordinate
                if(gamefield[i][j]!=100){ 
                    //check if x coordinate is not 0
                    if(i!=0) {
                        //and if tile x-1 is a mine, then +1 to num. mines
                        if(gamefield[i-1][j]==100) numb_mines++;
                        if(j!=0) { //check if y coordinate is not 0,
                            //and if tile x-1, y-1 is a mine, then +1 to num. mines
                            if(gamefield[i-1][j-1]==100) numb_mines++;}

                } //repeat same logic as above for other adjacent tiles
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
//        print mine locations and mine indicators in a grid
        for (int i = 0; i < boardrules[0]; i++) {
            for (int j = 0; j < boardrules[1]; j++) {
                System.out.print(gamefield[i][j]+" | ");
            }
            System.out.println("");

        }
        //return gamefield array with updated mine indicator positions
        return gamefield;


    }}
