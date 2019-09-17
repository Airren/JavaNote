package com.company.xiaohongshu._2nd;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();
        char[] charlist = new char[n];
        int j = 0;
        boolean flag = false;
        for (int i = 0; i < n ; i++) {
            if (flag == false && str.charAt(i) != '(' && str.charAt(i) != ')' && str.charAt(i) != '<' ){
                charlist[j++] = str.charAt(i);
            }else if (str.charAt(i)=='<' ){
                charlist[j--] = ' ';
                if (j<0) {
                    j=0;
                }
            }else if (str.charAt(i) == '(' &&  flag == false){
                flag = true;
            } else if (str.charAt(i) == '(' &&  flag == true){
                flag = false;
            }
        }

        for (int i = 0; i < j; i++) {
            if (charlist[i] != ' '){
                System.out.print(charlist[i]);
            }

        }
    }
}

