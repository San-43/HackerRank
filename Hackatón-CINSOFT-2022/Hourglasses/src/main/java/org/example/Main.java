package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[6][6];
        int max = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                ArrayList<Integer> hourglass = new ArrayList<>();
                for (int n = i; n < i + 3; n++) {
                    for (int m = j; m < j + 3; m++) {
                        hourglass.add(array[n][m]);
                    }
                }
                if (max < sum(hourglass)) {
                    max = sum(hourglass);
                }
            }
        }

        System.out.println(max);
    }
    public static int sum(ArrayList<Integer> hourglass) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (i != 4 && i != 6) {
                sum += hourglass.get(i);
            }
        }
        return sum;
    }
}