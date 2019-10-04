package com.company.wangyi._3rd;

import java.util.Scanner;

class Main {
    public static  int findLengthOfLCIS(int[] nums) {
        int ans = 0, anchor = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {



            if (i > 0 && nums[i-1] >= nums[i]) {
                 sum = 0;
                for (int j = anchor; j < i-1; j++) {
                    sum+= nums[j];
                }
                if (nums[i-1] > sum){
                    anchor = i;
                }


            }
            ans = Math.max(ans, i - anchor + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int m = sc.nextInt();
            int[] num = new int[m];

            for (int j = 0; j <m ; j++) {
                num[j] = sc.nextInt();
            }

            res = res + findLengthOfLCIS(num)+" ";

        }
        System.out.println(res);
    }
}

/*
2
5
1 3 9 2 6
5
4 2 9 16 7
 */

