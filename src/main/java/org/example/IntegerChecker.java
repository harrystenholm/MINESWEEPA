package org.example;
import java.util.Scanner;

public class IntegerChecker {
    public int inputerror() {
        Scanner input = new Scanner(System.in);
        //System.out.println(num);
        int num;
        do {
            while (!input.hasNextInt()) {
                System.out.println("That's not a number! Try again silly!");
                input.next(); // this is important!
            }
            num = input.nextInt();
        } while (num != (int)num);
        return num;
    }}
