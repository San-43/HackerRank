package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().replaceAll("/[A-Z0-9\\s{}() ]/", "").split(", ");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (String s : str) {
            list.add(Integer.valueOf(s.replace("[", "").replace("]", "")));
        }
        int positive = 0;
        int negative = 0;

        for (Integer i : list) {
            if (!check(i, list2)) {
                if (i < 0) {
                    negative++;
                } else {
                    positive++;
                }
            }
            list2.add(i);
        }
        if (negative > positive) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static boolean check(Integer a, ArrayList<Integer> list) {
        for (Integer i : list) {
            if (Objects.equals(i, a)) {
                return true;
            }
        }
        return false;
    }
}