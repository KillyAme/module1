package com.alevel.java.nix.module1;

public class UnicArrayNumbers {
    private int[] array;

    public static int countUnicNumbers(int array[]) {
        int count = 0;
        int countUnic = 0;

        for (int i = 0, length = array.length; i < length; i++) {
            countUnic++;
            for (int j = i + 1; j < length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return countUnic - count;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 3, 5, 5, 1};
        System.out.println(countUnicNumbers(array));
    }
}
