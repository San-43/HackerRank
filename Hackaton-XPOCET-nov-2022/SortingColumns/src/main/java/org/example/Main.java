package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int[] sorted = sortingColumns(array, i, n);
            swapping(array, i, sorted);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");;
            }
            System.out.println();
        }
    }
    static int[] sortingColumns(int[][] array, int j, int n) {
        int[] max = new int[n];
        for (int i = 0; i < n; i++) {
            max[i] = array[i][j];
        }
        Arrays.sort(max);
        return max;
    }

    static void swapping(int[][] array, int j, int[] sorted) {
        for (int i = 0; i < sorted.length; i++) {
            array[i][j] = sorted[i];
        }
    }
}