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