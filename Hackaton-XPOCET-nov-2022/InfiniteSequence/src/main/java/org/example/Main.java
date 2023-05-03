package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; a > 0; a--, i++) {
            if (i == b) {
                for (; i >= 2 && a > 0; i--, a--) {
                    System.out.print(i + " ");
                }
            }
            if (a > 0) {
                System.out.print(i + " ");
            }
        }
    }
}