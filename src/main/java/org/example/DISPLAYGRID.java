package org.example;

public class DISPLAYGRID {
    public static void DisplayGrid(int[] boardrules, int[][] gamefield, int[][] visiblegrid) {
        //add tab formatting
        System.out.print("\t ");
        //print x axes
        for(int i=0; i < boardrules[0]; i++) {
            if (boardrules[0] > 9) {
                while (i < 10 && boardrules[0] > 9){
                    System.out.print(" " + i + "  ");
                    i++;
                }
                System.out.print("" + i + "  ");
            } else {
                System.out.print(" " + i + "  ");
            }
        }
        //add new line
        System.out.print("\n");
        //print y axes and visible grid
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
                        System.out.print(" ");
                    }

                    else if (visiblegrid[i][j]==25) {
                        System.out.print("F");
                    }

                    else {
                        System.out.print(visiblegrid[i][j]);
                    }
                    System.out.print(" | ");
                }
                System.out.print("\n");
            }
    }
}
