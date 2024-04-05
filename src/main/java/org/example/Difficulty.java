package org.example;

public class Difficulty {
    public static int[] boardrules(int difficulty) {
        int columns = 0;
        int rows = 0;
        int mines = 0;
        switch (difficulty) {
            case 1:
                columns = 9; rows = 9; mines = 10;
                break;
            case 2:
                columns = 16; rows = 16; mines = 40;
                break;
            case 3:
                columns = 16; rows = 30; mines = 99;
                break;}
        var boardrules = new int[]{columns, rows, mines};

        return boardrules;
    }
}
