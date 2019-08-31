import java.util.*;

package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] strs = str.split(" ");

        String[] stack = new String[2 * n - 1];

        String preO = "+-";

        int tmp = 0;
        int start = 0;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i % 2 == 0) {

            } else {
                if (preO.contains(strs[i])) {
                    tmp++;
                } else {
                    preO = "*/";
                    // 排序
                    for (int i = 0; i < array.length; i++)
                        for (int j = 0; j < array.length - 1 - i; j++)
                            if (array[j + 1] < array[j]) {
                                int temp = array[j + 1];
                                array[j + 1] = array[j];
                                array[j] = temp;
                            }

                    // 重置 start
                    start = i - 1;
                    tmp = 0;
                }
            }
        }
    }

    public static void sortInt(int[] arr) {
        Arrays.sort(arr);
    }
}

/*
 * 6 3 + 2 + 1 + -4 * -5 + 1
 */

/*
 * 6 3 + 2 + 1 + -4 * -5 + 1
 */
