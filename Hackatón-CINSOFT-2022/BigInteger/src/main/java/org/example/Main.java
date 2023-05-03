package org.example;

import jdk.jfr.Unsigned;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        BigInteger big = BigInteger.valueOf((long) (Math.pow(a, b) + Math.pow(c, d)));

        System.out.println(big);
    }
}