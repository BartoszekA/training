package com.training.firststeps;

public class ChristmasTree {
    public static void drawChristmasTree(int numberOfLevels) {
        for (int n = 0; n < numberOfLevels; n++) {
            for (int m = 0; m <= (numberOfLevels - n); m++) {
                System.out.print(" ");
            }
            if (n == 0) {
                System.out.println("*");
            } else {
                for (int a = 0; a <= (2 * n); a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (numberOfLevels >= 3) {
            for (int n = 0; n <= 1; n++) {
                //for (int m = 0; m <= (numberOfLevels - 1); m++) {
                for (int m = 1; m <= numberOfLevels; m++) {
                    System.out.print(" ");
                }
                System.out.println("***");
            }
        }
    }
}
