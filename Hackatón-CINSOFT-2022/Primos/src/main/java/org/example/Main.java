package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> result= new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(int numero) {
        if (numero == 0 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}