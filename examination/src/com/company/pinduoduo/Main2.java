package com.company.pinduoduo;


import com.sun.tools.classfile.ConstantPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] arr = new int[m];
//        for (int i = 0; i < m; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for(int i:arr) {
//            System.out.println(i);
//        }
        List<Integer> ss= new ArrayList<Integer>();
        ss=getSum(ss,1,2);
        System.out.println(ss.size());
        ss=getSum(ss,2,3);
        System.out.println(ss.size());
        ss=getSum(ss,3,4);
        System.out.println(ss.size());
    }

    public static List<Integer> getSum(List<Integer> list, int s1, int e1) {
        List<Integer> temp = new ArrayList<>();
        for (int i = s1; i <= e1; i++) {
            temp.add(i);
        }
        temp.removeAll(list);
        list.addAll(temp);
        return list;
    }
}
