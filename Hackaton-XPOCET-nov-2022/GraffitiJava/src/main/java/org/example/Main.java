package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s;
        int t;

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            s = scanner.next();
            t = scanner.nextInt();
            switch (s) {
                case "abajo":
                    x++;
            }
        }
    }
}