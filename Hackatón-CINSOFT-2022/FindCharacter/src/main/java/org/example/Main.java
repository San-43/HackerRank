package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();

        System.out.println(s.replaceAll(s1, "(" + s1 + ")"));
    }
}