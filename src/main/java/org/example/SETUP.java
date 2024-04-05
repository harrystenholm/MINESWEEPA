package org.example;
import java.util.Random;

public class SETUP {
    public static int[][] setup(int[] boardrules) {
        MineField build = new MineField();
//        for (int i = 0; i < boardrules.length;i++)
//        System.out.println(boardrules[i]);
        int[][] gamefield = new int[boardrules[0]][boardrules[1]];

        for (int i = 0; i < boardrules[2]; i++) {
            Random random = new Random();
            int x = random.nextInt(9);
            int y = random.nextInt(9);
            gamefield[x][y] = 100;
        }
//        for (int i = 0; i< boardrules.length;i++) {
//            System.out.println(boardrules[i]);
//        }
        build.minefield(boardrules, gamefield);
        return gamefield;
    }}
