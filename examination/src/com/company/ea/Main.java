package com.company.ea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] str = input.split(",");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);

        List<Integer> list = new ArrayList<>();
        for (int i = start; i <=end ; i++) {
            if(isZDN(i)){
                list.add(i);
            }
        }
        System.out.println(list.size());
    }
    public static boolean isZDN(Integer num){
        String str = Integer.toBinaryString(num);

        int zero = 0;
        int ones = 0;
        for (int i = 0; i <str.length() ; i++) {
           if (str.charAt(i)=='0'){
               zero++;
           }else {
               ones++;
           }
        }
        return zero>=ones? true:false;
    }


}
