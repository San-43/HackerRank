package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        int numerator = (int) (n * 10000);
        int mcd = MCD(numerator, 10000);

        System.out.println(numerator/mcd + "/" + 10000/mcd);
    }
    public static int MCD(int a, int b) {
        if (b == 0) return a;
        return MCD(b, a%b);
    }
}