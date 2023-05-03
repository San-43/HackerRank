package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = new String[1000];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                s = str.split(" ");
                break;
            } else if (str.charAt(i) == '_') {
                s = str.split("_");
                break;
            }
        }
        System.out.print(s[0].toLowerCase());
        int count = 0;

        for (String i:
             s) {
            if (count == 0) {
            } else {
                for (int j = 0; j < i.length(); j++) {
                    if (j == 0) {
                        System.out.print(Character.toUpperCase(i.charAt(j)));
                    } else {
                        System.out.print(i.charAt(j));
                    }
                }
            }
            count++;
        }
    }
}