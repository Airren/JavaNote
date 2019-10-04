package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <m ; i++) {
            int[] req = new int[2];
            req[0] = sc.nextInt();
            req[1] = sc.nextInt();

            res.add(count(arr,req));

        }
        for (Integer re : res) {
            System.out.println(re);
        }



    }

    public static int count(int[] arr, int[] req){

        int sum = 0;
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = req[0]-1; i <req[1] ; i++) {

            if (!maps.containsKey(arr[i])){
                maps.put(arr[i], 1);
            }else {
                maps.put(arr[i],maps.get(arr[i])+1);
            }
        }

        for (Integer n: maps.keySet()) {
            if (maps.get(n)==1){
                sum++;
            }
        }
        return  sum;
    }
}
/*
5
2 1 1 2 2
5
1 2
1 3
1 2
1 3
2 4
 */