package com.company.xiaomi._2nd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().trim();
        String[] strs = str.split(" ");
        int m = strs.length;
        int[][] arry = new int[n][m];
        for (int j = 0; j < m; j++) {
            arry[0][j] = Integer.parseInt(strs[j]);
        }
        for (int i = 1; i < n; i++) {
            str = sc.nextLine().trim();
            strs = str.split(" ");
            for (int j = 0; j < m; j++) {
                arry[i][j] = Integer.parseInt(strs[j]);
            }
        }
        /**
         * 一下为算法， 这一行上面全是输入
         */
        for (int r = 0; r < arry.length; r++) {
            for (int c = 0; c < arry[r].length; c++) {
                if (arry[r][c] != 0) {
                    for (int c1 = c + 1; c1 < arry[r].length; c1++) {
                        if (arry[r][c] == arry[r][c1]) {
                            arry[r][c] *= 2;
                            arry[r][c1] = 0;
                            break;
                        } else if (arry[r][c1] != 0) {
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < arry.length; i++) {
            int count = 0;
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j] != 0) {
                    System.out.print(arry[i][j] + " ");
                    count++;
                }
            }
            for (int j = 0; j < arry[0].length - count; j++) {
                System.out.print(0 + " ");
            }
            System.out.println("");
        }


    }
}



/*
4
0 0 2 4
0 2 2 2
0 4 2 2
8 8 2 2
 */