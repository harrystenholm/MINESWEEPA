package org.example;

import java.util.Random;

public class NextMove {
    public static int[][] changegrid(int i, int j,int[] boardrules, int[][] visiblegrid,int[][] gamefield) {
        visiblegrid[i][j] = 50;
        if(i!=0)
        {
            visiblegrid[i-1][j] = gamefield[i-1][j];
            if(visiblegrid[i-1][j]==0) visiblegrid[i-1][j] = 50;
            if(j!=0)
            {
                visiblegrid[i-1][j-1] = gamefield[i-1][j-1];
                if(visiblegrid[i-1][j-1]==0) visiblegrid[i-1][j-1]=50;

            }
        }
        if(i!=boardrules[0])
        {
            visiblegrid[i+1][j]=gamefield[i+1][j];
            if(visiblegrid[i+1][j]==0) visiblegrid[i+1][j]=50;
            if(j!=boardrules[1])
            {
                visiblegrid[i+1][j+1]= gamefield[i+1][j+1];
                if(visiblegrid[i+1][j+1]==0) visiblegrid[i+1][j+1] = 50;
            }
        }
        if(j!=0)
        {
            visiblegrid[i][j-1]=gamefield[i][j-1];
            if(visiblegrid[i][j-1]==0) visiblegrid[i][j-1] = 50;
            if(i!=boardrules[0])
            {
                visiblegrid[i+1][j-1]=gamefield[i+1][j-1];
                if(visiblegrid[i+1][j-1]==0) visiblegrid[i+1][j-1] = 50;
            }
        }
        if(j!=boardrules[1])
        {
            visiblegrid[i][j+1]=gamefield[i][j+1];
            if(visiblegrid[i][j+1]==0) visiblegrid[i][j+1] = 50;
            if(i!=0)
            {
                visiblegrid[i-1][j+1]=gamefield[i-1][j+1];
                if(visiblegrid[i-1][j+1]==0) visiblegrid[i-1][j+1] = 50;
            }
        }
        return visiblegrid;


    }
    public static int[][] changenear(int i, int j,int[] boardrules, int[][] visiblegrid,int[][] gamefield) {

        Random random = new Random();
        int x = random.nextInt()%4;

        visiblegrid[i][j] = gamefield[i][j];

        if (x == 0) {
            if (i != 0) {
                if (gamefield[i - 1][j] != 100) {
                    visiblegrid[i - 1][j] = gamefield[i - 1][j];
                    if (visiblegrid[i - 1][j] == 0) visiblegrid[i - 1][j] = 50;
                }
            }
            if (j != 0) {
                if (gamefield[i][j - 1] != 100) {
                    visiblegrid[i][j - 1] = gamefield[i][j - 1];
                    if (visiblegrid[i][j - 1] == 0) visiblegrid[i][j - 1] = 50;
                }

            }
            if (i != 0 && j != 0) {
                if (gamefield[i - 1][j - 1] != 100) {
                    visiblegrid[i - 1][j - 1] = gamefield[i - 1][j - 1];
                    if (visiblegrid[i - 1][j - 1] == 0) visiblegrid[i - 1][j - 1] = 50;
                }

            }
        } else if (x == 1) {
            if (i != 0) {
                if (gamefield[i - 1][j] != 100) {
                    visiblegrid[i - 1][j] = gamefield[i - 1][j];
                    if (visiblegrid[i - 1][j] == 0) visiblegrid[i - 1][j] = 50;
                }
            }
            if (j != 9) {
                if (gamefield[i][j + 1] != 100) {
                    visiblegrid[i][j + 1] = gamefield[i][j + 1];
                    if (visiblegrid[i][j + 1] == 0) visiblegrid[i][j + 1] = 50;
                }

            }
            if (i != 0 && j != 9) {
                if (gamefield[i - 1][j + 1] != 100) {
                    visiblegrid[i - 1][j + 1] = gamefield[i - 1][j + 1];
                    if (visiblegrid[i - 1][j + 1] == 0) visiblegrid[i - 1][j + 1] = 50;
                }
            }
        } else if (x == 2) {
            if (i != 9) {
                if (gamefield[i + 1][j] != 100) {
                    visiblegrid[i + 1][j] = gamefield[i + 1][j];
                    if (visiblegrid[i + 1][j] == 0) visiblegrid[i + 1][j] = 50;
                }
            }
            if (j != 9) {
                if (gamefield[i][j + 1] != 100) {
                    visiblegrid[i][j + 1] = gamefield[i][j + 1];
                    if (visiblegrid[i][j + 1] == 0) visiblegrid[i][j + 1] = 50;
                }

            }
            if (i != 9 && j != 9) {
                if (gamefield[i + 1][j + 1] != 100) {
                    visiblegrid[i + 1][j + 1] = gamefield[i + 1][j + 1];
                    if (visiblegrid[i + 1][j + 1] == 0) visiblegrid[i + 1][j + 1] = 50;
                }
            }
        } else {
            if (i != 9) {
                if (gamefield[i + 1][j] != 100) {
                    visiblegrid[i + 1][j] = gamefield[i + 1][j];
                    if (visiblegrid[i + 1][j] == 0) visiblegrid[i + 1][j] = 50;
                }
            }
            if (j != 0) {
                if (gamefield[i][j - 1] != 100) {
                    visiblegrid[i][j - 1] = gamefield[i][j - 1];
                    if (visiblegrid[i][j - 1] == 0) visiblegrid[i][j - 1] = 50;
                }

            }
            if (i != 9 && j != 0) {
                if (gamefield[i + 1][j - 1] != 100) {
                    visiblegrid[i + 1][j - 1] = gamefield[i + 1][j - 1];
                    if (visiblegrid[i + 1][j - 1] == 0) visiblegrid[i + 1][j - 1] = 50;
                }
            }
        }
    return visiblegrid;
    }}
