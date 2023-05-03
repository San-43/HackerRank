package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        int max = Collections.max(lst);

        String[][] asterisksArray = new String[max][n];
        for (int i = 0; i < Collections.max(lst); i++) {
            for (int j = 0; j < n; j++) {
                asterisksArray[i][j] = " ";
            }
        }

        fillAsterisks(lst, max, asterisksArray);

        printer(asterisksArray, Collections.max(lst), n);

    }

    private static void fillAsterisks(ArrayList<Integer> lst, int max, String[][] asterisksArray) {
        for (int i = 0; i < Collections.max(lst); i++, max--) {
            for(int j = 0; j < lst.size(); j++) {
                if (lst.get(j) == max) {
                    for (int row = i; row < Collections.max(lst); row++) {
                        asterisksArray[row][j] = asterisksArray[i][j].replace(" ", "*");
                    }
                }
            }
        }
    }

    public static void printer(String[][] array, int max, int n) {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}