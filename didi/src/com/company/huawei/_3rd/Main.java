package com.company.huawei._3rd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例

            String s = in.nextLine();
            if (!s.equals("")){
                stringBuffer.append(s.replace(" ",""));
            }else {
                break;
            }


        }
        System.out.println(check(stringBuffer.toString()));
    }

    public static String check(String str){

        // 花括号必须成对出现
        // [ 出现在 ： 后面 且成对
        // "" 必须成对出现，中间只有字符
        // , 的出现位置

        int err_1 = 0; // [
        int err_2 = 0; // {
        int err_3 = 0; // "
        int err_4 = 0; // ,

        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        int num_4 = 0;
        int num_5 = 0;



        int len = str.length();
        for (int i = 0; i < len; i++) {
           switch (str.charAt(i)){
               case '[': err_1 +=1;num_1++;break;
               case ']': err_1 -=1;break;
               case '{': err_2 +=1;num_2++;break;
               case '}': err_2 -=1;break;
               case '"': err_3 +=1;num_3++;break;
               case ':':num_5++;
               default:;
           }
        }

        StringBuffer res = new StringBuffer();
        if (err_1 !=0 ){
            res.append(1);
        }
        if (err_2 !=0 ){
            res.append(2);
        }
        if (err_3 !=0 ){
            res.append(3);
        }

        if (num_3%num_5!=0){
            res.append(4);
        }
        if(res.toString().equals("")){
            return "0";
        }else {
            return res.toString();
        }

    }
}