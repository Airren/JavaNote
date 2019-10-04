package com.company.dianxin._1st;

import java.util.Scanner;

public class Main {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));
    }


}

/*
7
1 2 2 1 3 4 3
 */