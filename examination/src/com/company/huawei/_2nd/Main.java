package com.company.huawei._2nd;

import java.io.StringReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            in.nextLine();
            List<String> list = new ArrayList<>(a);
            for (int i = 0; i < a ; i++) {
                String str = in.nextLine();
                list.add(str.trim().replace(" ",""));
            }
            System.out.println(getValue(list));
        }
    }

    public static String getValue(List<String> list){

        Map<String, Integer> varMap = new HashMap<>();
        String finalName = "";
        for (String s : list) {
            String[] str = s.split("=");

            if (str.length > 2){

            }else {

            }

            finalName = str[0];
            // 拿到等号左边边的变量名字
            if (!varMap.containsKey(str[0])){
                varMap.put(str[0],null);
            }
            if (str[1].contains("+")){
                // 如果等号的右边是等式
                String[] strRight = str[1].split("\\+");
                int sum = 0;
                for (int i = 0; i < strRight.length; i++) {
                    if (strRight[i].charAt(0) >='0' && strRight[i].charAt(0) <='9' ){
                        sum += Integer.parseInt(strRight[i]);
                    }else if (varMap.containsKey(strRight[i])){
                        sum += varMap.get(strRight[i]);
                    }else {
                        return "NA";
                    }
                }
                varMap.put(str[0],sum);
            }else if(str[1].charAt(0) >= '0' && str[1].charAt(0) <= '9' && !str[1].contains("+")){
                // 如果等号的右边只有 一个数字
                varMap.put(str[0],Integer.parseInt(str[1]));
            }else {
                // 等号右边或者是只有 1个变量名字
                if (!varMap.containsKey(str[1])){
                    return "NA";
                }
                varMap.put(str[0],varMap.get(str[1]));

            }
        }

        if (varMap.containsKey(finalName)){
            return varMap.get(finalName).toString();
        }else{
            return "NA";
        }

    }
}


/*
2
yy =cc
xx = yy +1



4
   xx=yy
yy = 5
   zz = xx
 cd= 2+ 2 + 2 + 2


 9

 */