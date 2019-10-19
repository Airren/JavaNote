package com.company.meituan._3rd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            list.add(count(i));
        }
//        System.out.println(list.toString().substring(1,list.size()*2+2));
        for (int i = 0; i <list.size()-1 ; i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println(list.get(list.size()-1));

    }
    public static int count(int n){
        int count = 0;
        while(n!=0){
            if((n&1) != 0){
                ++count;
            }
            n = n >> 1;
        }
        return count;
    }
}
