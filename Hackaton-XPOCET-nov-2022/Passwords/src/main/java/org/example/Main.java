package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> map = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                map.add(s + ": Invalida");
            } else if (!Character.isLetter(s.charAt(0))) {
                map.add(s + ": Invalida");
            } else if (s.length() < 6 || s.length() > 12) {
                map.add(s + ": Invalida");
            } else if (containSymbols(s)) {
                map.add(s + ": Invalida");
            } else if (!containDigit(s)) {
                map.add(s + ": Invalida");
            } else {
                map.add(s + ": Valida");
            }
        }
        for (String s : map) {
            System.out.println(s);
        }
    }

    public static boolean containSymbols(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    public static boolean containDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}