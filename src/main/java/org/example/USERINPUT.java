package org.example;

import java.util.Scanner;

public class USERINPUT {
    public static int[][] URTURN(int[] boardrules, int[][] gamefield, int[][]visiblegrid) {
        Scanner input = new Scanner(System.in);
        IntegerChecker testinput = new IntegerChecker();
        //testinput.inputerror(input.nextInt());
        System.out.println("Enter X Coordinate:");
        int coordx = testinput.inputerror();
        while ((coordx > 8) || (coordx < 0)) {
            System.out.println("Please enter number between 0 & 8:");
            coordx = testinput.inputerror();
        }
        System.out.println("Enter Y Coordinate:");
        int coordy = testinput.inputerror();
        while ((coordy > 8) || (coordy < 0)) {
            System.out.println("Please enter number between 0 & 8:");
            coordy = testinput.inputerror();
        }
        visiblegrid = CheckHit.checkhit(coordy,coordx,boardrules,gamefield, visiblegrid);
        return visiblegrid;

    }
}
