package com.company.huawei._1st;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();

            System.out.println(getValue(a));
        }
    }

    public  static int getValue(int total){

        int num;
        int nine = total/9 + 1 ;
        for (int i = 0; i < nine ; i++) {
            if ((total - 9*i)%4==0){
                return i+(total-9*i)/4;
            }
        }
        return -1;
    }
}