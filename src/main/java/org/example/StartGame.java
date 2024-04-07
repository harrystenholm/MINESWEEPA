package org.example;

public class StartGame {
    public static int[] start() {
        IntegerChecker testinput = new IntegerChecker();
        Difficulty level = new Difficulty();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("-----WELCOME TO MINESWEEPA-----");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Please Select Your Difficulty");
        System.out.println("Easy (1), Medium (2), Hard (3)");
        int difficulty = 0;
        //take difficulty input
        do {difficulty = testinput.inputerror();
            int i = 0;
            i++;
            if (i > 0) {
                if (difficulty < 1 || difficulty > 4){
                    System.out.println("Please Enter A Valid Number.");
                }}
        } while (difficulty < 1 || difficulty > 4);
        //parse difficulty input to boardrules class
        int[] boardrules = Difficulty.boardrules(difficulty);
        return boardrules;
    }}
