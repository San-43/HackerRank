package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replace(" ", "");
        String[] str2 = str.split("0");
        int max;
        try {
            max = str2[0].length();
            for (int i = 1; i < str2.length; i++) {
                if (max < str2[i].length()) {
                    max = str2[i].length();
                }
            }
            System.out.println(max);
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}