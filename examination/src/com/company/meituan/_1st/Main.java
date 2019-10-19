package com.company.meituan._1st;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        String str = "MPMPCPMCMDEFEGDEHINHKLIN";
        getRes(str);
    }

    public static void getRes(String str) {


        int n = str.length();
        if (n <= 0) {
            return ;
        }

        List<Integer> list = new ArrayList<>();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char cur = str.charAt(i);
            set.add(cur);
            boolean flag = true;
            for (Character character : set) {
                if (!str.substring(i + 1).contains(String.valueOf(character))) {
                    flag = flag && true;
                } else {
                    flag = flag && false;
                }
            }
            if (flag == true) {
                list.add(i + 1);
                set.clear();
            }

        }

        int pre = 0;
        for (Integer integer : list) {
            System.out.print((integer - pre) + " ");
            pre = integer;
        }

    }
}




/*
MPMPCPMCMDEFEGDEHINHKLIN
 */