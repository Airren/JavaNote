package com.company.vivo._1st;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            list.add(i+1);
        }
        int num = 1;
        while (!list.isEmpty()){
            List<Integer> del = new LinkedList<>();
            for (int i = 1; i <= list.size(); i++) {
                if (num%m==0){
                    System.out.print(list.get(i-1)+" ");
                    del.add(list.get(i-1));
                }
                num++;
            }
            for (Integer integer : del) {
                list.remove(integer);
            }
        }

    }
}

/*
6 3

3 6 4 2 5 1
 */


