package com.company.yitu;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入预算金额：");
        int money = scanner.nextInt();
        int costMoney = 0;
        //  39 12 5 98 36
        int[] target = new int[0];
        System.out.println("请输入您想要购买的商品价格，以0结束");
        int num = 0; //数组的长度
        while(scanner.hasNext()) { //判断是否有下一个值

            int result = scanner.nextInt();
            if(result == 0) {
                break;
            }
            num++;
            target = Arrays.copyOf(target, num);
            System.out.println(result);
            target[num-1] = result;

        }
        System.out.println(Arrays.toString(target));
        //  23 47 2 34 89 12 11
        Arrays.sort(target);
        //costMoney = target[0];
        for(int price : target) {
            if(costMoney < money) {
                costMoney += price;

                if(costMoney > money) {
                    costMoney -= price;
                    break;
                }
            }
        }
        System.out.println("最多能花："+costMoney);
    }
}
