 java Note





[多线程与并发](imooc/imooc_剑指offer/8th_Java多线程与并发/8th_java多线程与并发.md)



```
package com.company.iqiyi._1st;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int numPermsDISequence(String S) {
        int MOD = 1_000_000_007;
        int N = S.length();
        // dp[i][j] : Num ways to place P_i with relative rank j
        int[][] dp = new int[N+1][N+1];
        Arrays.fill(dp[0], 1);

        for (int i = 1; i <= N; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (S.charAt(i-1) == '1') {
                    for (int k = j; k < i; ++k) {
                        dp[i][j] += dp[i-1][k];
                        dp[i][j] %= MOD;
                    }
                } else {
                    for (int k = 0; k < j; ++k) {
                        dp[i][j] += dp[i-1][k];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }

        int ans = 0;
        for (int x: dp[N]) {
            ans += x;
            ans %= MOD;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        str = str.replace(" ","");
        System.out.println(numPermsDISequence(str));
    }
}



/*
4
1 1 0
 */
```




```
第二题
```
```
/**
 * describe:
 *
 * @author jehu
 * @date 2019/09/08
 */
package iqiyi;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int red = sc.nextInt();
            int black = sc.nextInt();
            double sum = removeball(red,black);
            String str = String.format("%.5f", sum);
            System.out.println(str);
        }
    }
    public static double removeball (int red, int black){
        if (red == 0 ) {
            return 0.0d;
        }
        if (black == 0) {
            return 0.0d;
        }
        double one = (double)red/(red+black);
        black-=1;
        double two = 0.0d;
        double three = 0.0d;
        double other = 1.0d;
        double B_black = 1.0d;
        if (black+red > 2) {
            other = 1.0d - one;
            B_black = (double)black/(red+black);
            if (B_black > 0.0d) {
                black-=1;
                if (black > 0){
                    double C_black = (double)black/(red+black);
                    two = removeball(red,black-1)*C_black;
                }
                if (red > 0) {
                    double C_red = (double)red/(red+black);
                    three = removeball(red-1,black)*C_red;
                }
            }
        }
        return one+(other*B_black*(two+three));
    }
}
```