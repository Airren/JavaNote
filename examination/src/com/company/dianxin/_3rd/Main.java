package com.company.dianxin._3rd;

import java.util.Scanner;

class Main {
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim().substring(1,str.length()-1);

        String[] numberStr = str.split(",");

        int [] nums = new int[numberStr.length];
        for (int i = 0; i < numberStr.length ; i++) {
            nums[i] = Integer.parseInt(numberStr[i].trim());
        }
        System.out.println(maxSubArray(nums));
    }
}

/*
[2, 4, -2, 5, -6]
9
 */
