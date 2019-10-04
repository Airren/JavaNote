package com.company.dianxin._2nd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.trim().split(";");

        System.out.println(check(strs[0], strs[1]));
    }

    public static boolean check(String s, String t) {
        int[][] flag = new int[127][2];
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (flag[chars[i] - '\0'][1] == chart[i] - '\0') {
                continue;
            } else if (flag[chart[i] - '\0'][0] == 0 && flag[chars[i] - '\0'][1] == 0) {
                flag[chart[i] - '\0'][0] = 1;
                flag[chars[i] - '\0'][1] = chart[i] - '\0';
            } else {
                return false;
            }
        }
        return true;
    }

}

/*
ababa;ststs
True
 */