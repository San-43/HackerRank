package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().replaceAll("[a-z\\s{}() '$]", "").split(",");
        str[0] = str[0].replace("[", "");
        str[str.length-1] = str[str.length - 1].replace("]", "");
        ArrayList<Float> num = new ArrayList<>();
        for (String s :
                str) {
            num.add(Float.valueOf(s));
        }
        System.out.println(num);
    }
}