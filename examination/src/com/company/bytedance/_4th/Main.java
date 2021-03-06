package com.company.bytedance._4th;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int money = sc.nextInt();
        int[] ori = new int[n];
        int[] weight= new int[n];
        int[] value= new int[n];

        for (int i = 0; i <n ; i++) {
             ori[i] = sc.nextInt();
             int tmp  = sc.nextInt();

             weight[i] = tmp -(ori[i] -tmp);
             value[i] = sc.nextInt();


        }
//        int[] test = new int[]{100,100,30,10};
//        int[] weight = new int[]{46,78,12,6};
//        int[] value = new int[]{60,35,30,10};

        System.out.println(ZeroOnePack(money,n,weight,value));

    }

    /**
     * 0-1背包问题
     * @param V 背包容量
     * @param N 物品种类
     * @param weight 物品重量
     * @param value 物品价值
     * @return
     */
    public static int  ZeroOnePack(int V,int N,int[] weight,int[] value){

        //初始化动态规划数组
        int[][] dp = new int[N+1][V+1];
        //为了便于理解,将dp[i][0]和dp[0][j]均置为0，从1开始计算
        for(int i=1;i<N+1;i++){
            for(int j=1;j<V+1;j++){
                //如果第i件物品的重量大于背包容量j,则不装入背包
                //由于weight和value数组下标都是从0开始,故注意第i个物品的重量为weight[i-1],价值为value[i-1]
                if(weight[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
            }
        }
        //则容量为V的背包能够装入物品的最大值为
        int maxValue = dp[N][V];
        //逆推找出装入背包的所有商品的编号
        int j=V;
        String numStr="";
        int sumt = 0;
        for(int i=N;i>0;i--){
            //若果dp[i][j]>dp[i-1][j],这说明第i件物品是放入背包的
            if(dp[i][j]>dp[i-1][j]){
                numStr = i+" "+numStr;
                sumt +=value[i-1];
                j=j-weight[i-1];
            }
            if(j==0)
                break;
        }
        return sumt;
    }
}
/*
4 100
100 73 60
100 89 35
30 21 30
10 8 10

2 100
100 30 35
140 140 100
 */
