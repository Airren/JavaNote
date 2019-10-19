package com.company.yitu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int res = n/2;

        int j = n/2-1;
        for (int i = n-1; i >=n/2 ; i--) {
            int cur = list.get(i);
            for ( ; j >=0 ; ) {
                int mid = list.get(j);
                if (cur<mid*2){
                    res ++;
                    j--;
                }else {
                    j--;
                    break;
                }
            }
        }

        System.out.println(n%2!=0?res+1:res);

    }
}



/*
4
1 2 3 4
2

4
1 2 3 3

 */