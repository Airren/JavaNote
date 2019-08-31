package com.company.didi;

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

        String preO = "";

        int tmp = 0;
        int start = 0;
        for (int k = 0; k< 2 * n; k++) {
            if (k % 2 == 0 && k<2*n-1) {
                tmp++;
            } else {
                if (preO.equals("")){
                    preO = strs[k];
                }
                if (k<2*n-1 && preO.contains(strs[k])) {

                } else {
                    if (k<2*n-1){
                        preO = strs[k];
                    }

                    // 排序
                    for (int i = start; i < start+(tmp-1)*2; i+=2) {
                        for (int j = start; j <start+(tmp-1)*2-2 ; j+=2) {
                            if (Integer.parseInt(strs[j + 2]) < Integer.parseInt(strs[j])) {
                                String temp = strs[j + 2];
                                strs[j + 2] = strs[j];
                                strs[j] = temp;
                            }
                        }
                    }
                    // 重置 start
                    start = k - 1;
                    tmp = 2;
                }
            }
        }

        for (int i = 0; i <strs.length ; i++) {
            System.out.print(strs[i]+" ");
        }
        System.out.println("");
    }
}

/*

6
3 + 2 + 1 + -4 * -5 + 1


10
3 + 2 + 1 + -4 * -5 + 1 + 6 + 3 + 2 + 0

10
3 + 2 + 1 + -4 * -5 + 1 + 6 + 3 * 2 + 0
*/

// 0 - 4  6 4
// 6 - 8  10 8
// 10 - 18 20 18