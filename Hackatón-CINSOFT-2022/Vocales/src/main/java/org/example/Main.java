package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String vocales = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                vocales += "a";
            }
            if (str.charAt(i) == 'e') {
                vocales += "e";
            }
            if (str.charAt(i) == 'i') {
                vocales += "i";
            }
            if (str.charAt(i) == 'o') {
                vocales += "o";
            }
            if (str.charAt(i) == 'u') {
                vocales += "u";
            }
        }
        System.out.println(vocales);
    }
}