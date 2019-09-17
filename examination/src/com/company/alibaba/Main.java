package com.company.alibaba;

import java.util.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {




/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String getIndexAndLongest(String users) {

        int len = users.length();

        int pre = 0;
        int total = 0;
        int preIndex = 0;
        int postIndex = 0;
        int max =0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {

            //
            if (users.charAt(i)=='g' && total ==0){
                total+=1;
                preIndex = i-1;
            }else if(users.charAt(i)=='g' && total != 0){
                total+=1;
            }else if (users.charAt(i)=='b'&& i>0 &&users.charAt(i-1)=='g' ){
                postIndex = i;
                max = Math.max(total,max);
                map.put("pre_"+preIndex, max);
                map.put("post_"+postIndex, max);
                total = 0;
            }else {
                total = 0;
            }
        }



        Map<String, Integer> mapMax = new HashMap<>();
        int maxvalue = 0;
        for (String i:map.keySet()){
            maxvalue = Math.max(maxvalue,map.get(i));
        }
        for (String i:map.keySet()){
            if (map.get(i) == maxvalue){
                mapMax.put(i,map.get(i));
            }
        }


        Map<String, Integer> resMap= new HashMap<>();

        for (String i:mapMax.keySet()){
            String[] str = i.split("_");
            if (str[0].equals("post")){
                if (resMap.containsKey(str[1])){
                    resMap.put(str[1],mapMax.get(i)+resMap.get(str[1]));
                }else {
                    resMap.put(str[1],mapMax.get(i));
                }

            }else {
                if (resMap.containsKey(str[1])){
                    resMap.put(str[1],mapMax.get(i)+resMap.get(str[1]));
                }else {
                    resMap.put(str[1],mapMax.get(i));
                }
            }

        }


        int index = Integer.parseInt((String) resMap.keySet().toArray()[0]);



        return ""+preIndex+ " 6";
    }






    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
////
        String _users;
        int k;
        try {
            _users = in.nextLine();
            k = in.nextInt();

        } catch (Exception e) {
            _users = null;
        }

//        String _users = "bgbbbgbggbgbg";
//        int k = 3;


        res = getIndexAndLongest(_users);
        System.out.println(res);
    }
}


/*
bgbbbgbggbgbg
3

 */