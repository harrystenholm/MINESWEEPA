package org.example;

public class CheckHit {
    public static int[][] checkhit(int x, int y,int[] boardrules, int[][] gamefield, int[][] visiblegrid){
        if (gamefield[x][y] == 100) {
            System.out.println("U hit a mine stupid!!");
            System.exit(0);
        } else if (gamefield[x][y] == 0) {
            //if user input hits blank space, call changegrid method
            visiblegrid = NextMove.changegrid(x, y, boardrules, visiblegrid, gamefield);
        } else {
            //if user input hits neither blank space or mine, call changenear method
            visiblegrid = NextMove.changenear(x, y, boardrules, visiblegrid, gamefield);
        }
        return visiblegrid;
    }
}
