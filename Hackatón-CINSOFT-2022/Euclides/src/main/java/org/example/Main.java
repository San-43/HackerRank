package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(MCD(a, b));
    }
    public static int MCD(int a, int b) {
        if (b == 0) return a;
        return MCD(b, a%b);
    }
}