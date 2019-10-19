package com.company.ea;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(catalan(n));
    }

    public static long catalan(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                arr[i] += arr[j - 1] * arr[i - j];
            }
        }
        return arr[n];


    }
}

