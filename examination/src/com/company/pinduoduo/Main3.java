package com.company.pinduoduo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4,5,6};
    List<List<Integer>> res=splitArr(arr);
    Integer[] a1=new Integer[res.get(0).size()];
    Integer[] a2=new Integer[res.get(1).size()];
    a1=res.get(0).toArray(a1);
    a2=res.get(1).toArray(a2);
    int ss=getSum(a1,a2,3);
    System.out.println(ss);
}

public static List<List<Integer>> splitArr(int[] arr){
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> a1=new ArrayList<>();
    List<Integer> a2=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        if(i%2==0) {
            a1.add(arr[i]);
        }
        if(i%2==1){
            a2.add(arr[i]);
        }
    }
    res.add(a1);
    res.add(a2);
    return res;
}

public static int getSum(Integer[] a, Integer[] b, int step){
    Arrays.sort(a);
    Arrays.sort(b);
    int n=a.length;
    int j = 1;
    for (int i = 0; i < n/2; i++) {
        int tmp = b[i];
        b[i] = b[n-j];
        b[n-j] = tmp;
        j++;
    }
    int sum = 0;
    for (int i = 0; i < step; i++) {
        sum = a[i]*b[i]+sum;
    }
    return sum;
}
}
