package org.example;

import static org.example.USERINPUT.URTURN;

public class Main {

    public static void main(String[] args) {
        IntegerChecker testinput = new IntegerChecker();
        int restart = 1;
        do {
        //start game, retrieve board size and mine count
        int[] boardrules = StartGame.start();
        int[][] visiblegrid = new int[boardrules[0]][boardrules[1]]; //initialise size of visible board using boardrules
        int[][] gamefield = new int[boardrules[0]][boardrules[1]];

        // DISPLAY BOARD BY CALLING DISPLAY FUNCTION, parse boardrules, gamefield, visiblegrid
        DISPLAYGRID.DisplayGrid(boardrules, gamefield, visiblegrid);

        //initialise variables used in the game
        boolean startgame = true;
        boolean firstmove = true;
            int flag = 0;
            int coordx = 0;
            int coordy = 0;
            int[] userinput = new int[]{flag, coordx, coordy};

        //start the game
            while (startgame) {

            //if this is the first move of the game
            if (firstmove) {
                //retrieve x y coordinates and flag preference
                userinput = URTURN(boardrules, gamefield, visiblegrid,firstmove);
                //set inputted coordinates in grid to 50 (empty tile)
                visiblegrid[userinput[2]][userinput[1]] = 50;
                //initialise minefield set up using first coords input, board settings
                gamefield = SETUP.setup(boardrules,visiblegrid);
                //change tiles around user input to reflect mines
                visiblegrid = CheckHit.checkhit(userinput[2],userinput[1], boardrules, gamefield, visiblegrid);
//            Cheat Sheet
//            for (int i = 0; i < boardrules[0]; i++) {
//                for (int j = 0; j < boardrules[1]; j++) {
//                    System.out.print(gamefield[i][j]+" | ");
//                }
//            System.out.println(""); }
                firstmove = false;}

            //this should always run after first if statement completes
            if (!firstmove) {
                //Display minefield
                DISPLAYGRID.DisplayGrid(boardrules, gamefield, visiblegrid);
                //TAKE USER INPUT FOR COORDINATES
                userinput = URTURN(boardrules, gamefield, visiblegrid, firstmove);
                //if flag option used
                if (userinput[0] == 1) {
                    if (visiblegrid[userinput[1]][userinput[2]] == 25) {
                        visiblegrid[userinput[1]][userinput[2]] = 0;
                    } else {
                        visiblegrid[userinput[1]][userinput[2]] = 25;
                    }
                }
                //if flag not used
                if ((userinput[0] == 0) && (!firstmove)) {
                    //check userinput against minefield
                    visiblegrid = CheckHit.checkhit(userinput[2], userinput[1], boardrules, gamefield, visiblegrid);
                }
            }

            //Checks Win Condition, returns true if all blank spaces found
            if (CheckWin.WinCondition(boardrules, visiblegrid, gamefield) && !firstmove) {
                startgame = false;
                DISPLAYGRID.DisplayGrid(boardrules, gamefield, visiblegrid);

                System.out.println("You Win You're the Best! I Love You!");
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                System.out.println("Would You Like To Play Again?");
                System.out.println("Yes (1) | No (0)");

                restart = testinput.inputerror();
                while ((restart > 1) || (restart < 0)) {
                    System.out.println("Please enter 0 or 1:");
                    restart = testinput.inputerror();}

                if (restart == 0) {
                    System.exit(0);}
            }
        }

    } while (restart == 1);
    }}

