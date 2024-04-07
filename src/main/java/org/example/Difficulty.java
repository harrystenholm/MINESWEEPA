package org.example;

public class Difficulty {
    public static int[] boardrules(int difficulty) {
        int columns = 0;
        int rows = 0;
        int mines = 0;
        //take difficulty input, switch case determine boardrules
        switch (difficulty) {
            case 1:
                columns = 9; rows = 9; mines = 10;
                break;
            case 2:
                columns = 16; rows = 16; mines = 40;
                break;
            case 3:
                columns = 16; rows = 30; mines = 99;
                break;
            case 4:
                columns = 3; rows = 3; mines = 2;
                break;}
        //initialise boardrules array
        int[] boardrules = new int[]{columns, rows, mines};

        return boardrules;
    }
}
