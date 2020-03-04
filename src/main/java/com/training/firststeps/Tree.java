package com.training.firststeps;

public class Tree {
    public static void drawTree(int a) {
        //linijka
        for (int n = 0; n < a; n++) {
            //spacje
            for (int m = 0; m <= a; m++) {
                System.out.print("_");
            }
            System.out.println("*");
        }
        // wiersz 2x
        for (int n = 0; n <= 1; n++) {
            //ilość spacji
            for (int m = 0; m <= (a-1); m++) {
                System.out.print("_");
            }
            System.out.println("***");
        }
    }
}
