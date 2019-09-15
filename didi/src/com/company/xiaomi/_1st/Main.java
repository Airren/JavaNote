package com.company.xiaomi._1st;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }

        int chg=0,cmp=0;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1-i;j++)
            {
                cmp++;
                if(a[j]>a[j+1])
                {
                    chg++;
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }


        System.out.println(Arrays.toString(a));
        System.out.println("比较次数:"+cmp);
        System.out.println("交换次数:"+chg);

        int chg1=0 ;
        int cmp1=0;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1-i;j++)
            {
                cmp1++;
                if(a[j]<a[j+1])
                {
                    chg1++;
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }

        System.out.println(Arrays.toString(a));
        System.out.println("比较次数:"+cmp1);
        System.out.println("交换次数:"+chg1);


        System.out.println(" 最小是： "+ Math.min(chg, chg1));

        sc.close();
    }
}
/*
4
4
2
7
6

 */