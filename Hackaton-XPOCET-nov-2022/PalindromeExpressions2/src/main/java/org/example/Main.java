package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        String[] answer = new String[n];
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            str[i] = scanner.nextLine().toLowerCase();
            String tmp = "";
            for(int j=0; j< str[i].length(); j++) {
                if(Character.isLetter(str[i].charAt(j))) {
                    tmp += str[i].charAt(j);
                }
            }
            StringBuilder stringBuilder = new StringBuilder(tmp);
            String reversed = stringBuilder.reverse().toString();
            if (reversed.equals(tmp)) {
                answer[i] = "SI";
            } else {
                answer[i] = "NO";
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}