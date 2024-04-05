package org.example;

public class DISPLAYGRID {
    public void DisplayGrid(int[] boardrules, int[][] gamefield, int[][] visiblegrid) {
        //visible grid
        System.out.print("\t ");
        for(int i=0; i < boardrules[0]; i++)
        {
            System.out.print(" " + i + "  ");
        }
        System.out.print("\n");
        for(int i=0; i < boardrules[0]; i++) {

            System.out.print(i + "\t| ");
            for(int j=0; j < boardrules[1]; j++)
                {
                    if(visiblegrid[i][j]==0)
                    {
                        System.out.print("?");
                    }
                    else if(visiblegrid[i][j]==50)
                    {
                        System.out.print("O");
                    }
                    else
                    {
                        System.out.print(visiblegrid[i][j]);
                    }
                    System.out.print(" | ");
                }
                System.out.print("\n");
            }
    }
}
