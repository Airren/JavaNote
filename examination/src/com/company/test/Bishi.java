package com.company.test;

import java.util.Scanner;

public class Bishi {

    public static void main(String[] args) {

        String res = "";
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = j+1;
            }
            res += getValue(arr)+"\n";
        }
        System.out.println(res);
    }

    public static String getValue(int[] arr){

        int sum = 0;
        int count = 0;
        int value = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                if (isrp(arr[i], arr[j])){
                    value = arr[i]* arr[j];
                }else {
                    value = 0;
                }

                sum+= value;
                count ++;



            }
        }

        if(sum%count==0){
            return ""+sum/count;
        }else {
            int b = get(sum,count);
            return ""+sum/b+"/"+count/b;
        }

    }

    public static boolean isrp(int a, int b){
        if(a==1||b==1)     // 两个正整数中，只有其中一个数值为1，两个正整数为互质数
            return true;
        while(true){          // 求出两个正整数的最大公约数
            int t = a%b;
            if(t == 0) break;
            else{
                a = b;
                b = t;
            }
        }
        if(b>1)	return false;// 如果最大公约数大于1，表示两个正整数不互质
        else return true;	// 如果最大公约数等于1,表示两个正整数互质
    }
    public static int get(int a, int b){
        if(a==1||b==1)     // 两个正整数中，只有其中一个数值为1，两个正整数为互质数
            return 1;
        while(true){          // 求出两个正整数的最大公约数
            int t = a%b;
            if(t == 0) break;
            else{
                a = b;
                b = t;
            }
        }
        if(b>1)	return b;// 如果最大公约数大于1，表示两个正整数不互质
        else return 1;	// 如果最大公约数等于1,表示两个正整数互质
    }
}

/*
2
2
4
 */