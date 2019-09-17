package com.company.xiaohongshu._3rd;


import java.util.Scanner;
public class Main {



    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=cin.nextInt();
        solve(arr);
    }


    public static void solve(int[] arr){

        int n=arr.length;
        int[][] dp=new int[2][n];

        dp[1][0]=arr[0];

        for(int i=1;i<n;i++){
            dp[0][i]=Math.max(dp[1][i-1],dp[0][i-1]);
            dp[1][i]=dp[0][i-1]+arr[i];
        }
        int max=Math.max(dp[0][n-1],dp[1][n-1]),res=max;
        int cnt=0;
        for(int i=arr.length-1;i>=0;i--){
            if(res==dp[0][i])
                continue;
            else
            {
                cnt++;
                res-=arr[i];
            }
        }
        System.out.println(max+" "+cnt);
    }
}

