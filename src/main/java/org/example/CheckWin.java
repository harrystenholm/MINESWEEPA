package org.example;

public class CheckWin {
    public static boolean WinCondition(int[] boardrules, int[][] visiblegrid, int[][] gamefield) {
        boolean wincondition = true;
        //check all tiles, if any hidden tiles are not mines, return false
        for (int i = 0; i < boardrules[0]; i++ ) {
            for (int j = 0; j < boardrules[1]; j++ ) {
                if (visiblegrid[i][j] == 0) {
                    if (gamefield[i][j] != 100) {
                        wincondition = false;
                }
            }
        }
        }
        return wincondition;

    }}
