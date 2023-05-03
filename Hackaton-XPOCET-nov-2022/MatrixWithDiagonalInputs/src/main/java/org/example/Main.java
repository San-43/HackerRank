package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int count = 1;

        for (
                int diagonal = m - 1;
                diagonal >= 1 - n;
                diagonal--
        ) {
            for (
                    int i = -Math.min(0, diagonal), j = -(Math.max(0, diagonal) - (m - 1));
                    i < n && j >= 0;
                    i++, j--
            ) {
                array[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}