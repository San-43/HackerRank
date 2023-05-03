package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean isPie = false;
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array[0].length; i++) {
            int[] max = getMax(array, i);
            if (getMin(max[0], array[max[1]])) {
                System.out.println("Punto de silla en (" + (max[1] + 1)  + "," + (i + 1) + "), Valor: " + max[0]);
                isPie = true;
            }
        }
        if (!isPie) {
            System.out.println("No hay");
        }
    }

    static int[] getMax(int[][] array, int j) {
        int max = array[0][j];
        int row = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i][j]) {
                max = array[i][j];
                row = i;
            }
        }
        return new int[] {max, row};
    }

    static boolean getMin(int value, int[] row) {
        for (int i : row) {
            if (i < value) {
                return false;
            }
        }
        return true;
    }
}