package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            String [] str = scanner.nextLine().split(" ");
            investWords(str, i);
            System.out.println();
        }
    }

    private static void investWords(String[] str, int a) {
        System.out.print("Case #" + a + ": ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
    }
}