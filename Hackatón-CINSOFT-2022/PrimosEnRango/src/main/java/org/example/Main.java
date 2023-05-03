package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().replaceAll("[a-z\\s{}() '$]", "").split(",");
        int a = Integer.valueOf(str[0].replace("[", ""));
        int b = Integer.valueOf(str[str.length - 1].replace("]", ""));

        System.out.println(result(a, b));
    }

    public static boolean result(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}