package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        StartGame Initialise = new StartGame();
        SETUP SetUp = new SETUP();

        int[] boardrules = Initialise.start();
//        System.out.println(boardrules);
        int[][] gamefield = SetUp.setup(boardrules);
        int[][] visiblegrid = new int[boardrules[0]][boardrules[1]];
        boolean startgame = true;
        while (startgame) {
//            for (int i =0; i < boardrules[0];i++) {
//                for (int j =0; j < boardrules[1];j++) {
//                    System.out.print(gamefield[i][j]+" | ");
//                } System.out.println("");
//            }
        // DISPLAY STARTING BOARD BY CALLING DISPLAY FUNCTION
        DISPLAYGRID displaygrid = new DISPLAYGRID();
        displaygrid.DisplayGrid(boardrules, gamefield, visiblegrid);

        //TAKE USER INPUT FOR COORDINATES
            //*****************
        //move number counter, starts at 0
            int movenumber = 0;
        //call method for user's turn, returns 1 for mine, 0 for otherwise
            visiblegrid = USERINPUT.URTURN(boardrules,gamefield,visiblegrid);
            movenumber = movenumber++;
             //System.out.println(answer[1]);
            System.out.println("Move Number: "+movenumber);
//        if (startgame) {
//            startgame = false;
//        }
        }

    }}