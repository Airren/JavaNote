package com.company.xiecheng;

import java.util.Scanner;

public class Main2{

    public static int max=0;
    public static int sum=0;
    public static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] container = new int[N];

        for (int i = 0; i < N; i++) {
            container[i] = sc.nextInt();
        }

        int[][] satisArr = new int[N][M];

        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <M ; j++) {
                satisArr[i][j] = sc.nextInt();
            }
        }
        getDistric(N,container,M,satisArr,sum,max);
        System.out.println(res);
    }

    public static void getDistric(int N,int container[],int M,int satisArr[][],int sum, int max)
    {
        int i;
        if((M-1)==0)
        {
            for(i=0;i<N;i++)
            {
                if(container[i]>0)
                {
                    sum+=satisArr[0][i];
                    break;
                }
            }
            if(sum>max)
            {
                max=sum;
                res = max;
            }
        }
        else
        {
            for(i=0;i<N;i++)
            {
                if(container[i]>0)
                {
                    container[i]--;
                    sum+=satisArr[M-1][i];
                    getDistric(N,container,M-1,satisArr,sum,max);
                    container[i]++;
                    sum-=satisArr[M-1][i];
                }
            }

        }
    }
}



/*
3
3
1 1 1
100 50 25
100 50 25
100 50 25
 */

   