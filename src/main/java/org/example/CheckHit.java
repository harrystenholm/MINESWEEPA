package org.example;

public class CheckHit {
    public static int[][] checkhit(int x, int y,int[] boardrules, int[][] gamefield, int[][] visiblegrid){
        int hit = 0;
        if (gamefield[x][y] == 100) {
            System.out.println("U hit a mine stupid!!");
            System.exit(0);
        } else if (gamefield[x][y] == 0) {
            //hit = 0;
            visiblegrid = NextMove.changegrid(x, y, boardrules, visiblegrid, gamefield);

        } else {
            visiblegrid = NextMove.changenear(x, y, boardrules, visiblegrid, gamefield);
        }
        return visiblegrid;
    }
}
