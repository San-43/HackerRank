package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine().replace(")", ""));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count = i;
                int n = Integer.parseInt(String.valueOf(str.charAt(i)));
                String tmp = "";
                while (--count>= 0) {
                    if (str.charAt(count) == '(') {
                        tmp += str.substring(count+1, i);
                        break;
                    }
                }
                str.delete(count, i + 1);
                while (n > 0) {
                    str.insert(count, tmp);
                    n--;
                }
            }
        }
        System.out.println(str);
    }
}