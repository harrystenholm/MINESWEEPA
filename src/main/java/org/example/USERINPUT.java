package org.example;

import java.util.Scanner;

public class USERINPUT {
    public static int[] URTURN(int[] boardrules, int[][] gamefield, int[][]visiblegrid, boolean firstmove) {
        System.out.println(firstmove);
        Scanner input = new Scanner(System.in);
        IntegerChecker testinput = new IntegerChecker();
//        testinput.inputerror(input.nextInt());
        System.out.println("Do You Want To Place A Flag?");
        System.out.println("Yes (1) | No (0)");
        int flag = testinput.inputerror();
        while ((flag > 1) || (flag < 0)) {
            System.out.println("Please enter 0 or 1:");
            flag = testinput.inputerror();
        }
        System.out.println("Enter X Coordinate:");
        int coordx = testinput.inputerror();
        while ((coordx > boardrules[0]) || (coordx < 0)) {
            System.out.println("Please enter number between 0 & "+(boardrules[0]-1)+":");
            coordx = testinput.inputerror();
        }
        System.out.println(coordx);
        System.out.println("Enter Y Coordinate:");
        int coordy = testinput.inputerror();
        while ((coordy > boardrules[1]) || (coordy < 0)) {
            System.out.println("Please enter number between 0 & "+(boardrules[1]-1)+":");
            coordy = testinput.inputerror();
        }

        int[] userinput = new int[]{flag, coordx, coordy};
        return userinput;
    }}




//        visiblegrid = CheckHit.checkhit(coordy,coordx,boardrules,gamefield, visiblegrid);
//        return visiblegrid;
