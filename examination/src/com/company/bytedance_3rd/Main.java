package com.company.bytedance_3rd;

import apple.laf.JRSUIUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] A = new int[]{0,2 ,5 ,0 ,6};
        boolean[] B = new boolean[]{false, true, true, false, true};

        int n = A.length;


        int res =0;
        int start = 0;
        int end = 0;
        int sum =0;
        boolean flag = false;

        for (int i = 0; i <n ; i++) {
            if (B[i] == true && flag == false){

                start = i;
                flag = true;
            }else if((B[i] == false && flag== true)) {

                end = i;
                flag = false;
                sum = 0;
                for (int j = start; j < end; j++) {
                    sum =sum+A[j];
                }
                res = Math.max(sum,res);

            }
        }
        System.out.println(res);




//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//
//        for (int i = 0; i <n ; i++) {
//            System.out.println(getRes(arr[i][0],arr[i][1]));
//        }
    }

    public static int getRes(int A,int B) {

        int count = 0;
        int tmp = B;

        while (tmp > A) {
            if (tmp % 2 == 0) {
                tmp = tmp / 2;
            } else {
                tmp = (tmp - 1) / 10;
            }
            count++;
        }

        return tmp == A ? count : -1;

    }
}

/*
3
1 1
1 22
1 3

0
2
-1

 */

