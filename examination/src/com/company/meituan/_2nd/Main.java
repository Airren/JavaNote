package com.company.meituan._2nd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ReviewEncourage reviewEncourage = new ReviewEncourage(n);




    }
}

class ReviewEncourage {

    private int total ;
    private PrizePool prizePool;
    private int flag;

    public ReviewEncourage(int n) {
        this.total = n;
        this.prizePool = new PrizePool();
        this.flag = 0;

        for (int i = 1; i <= total; i++) {
            if (i%2==1){
                bonus(prizePool);
            }else {
                if (flag%2==0){
                    coupon(prizePool);
                }else {
                    contribution(prizePool);
                }
                flag++;
            }

        }


    }      // 构造函数,n为中奖用户数



    //PrizePool类仅有一个send方法，实现如下：

    public class PrizePool {

        public void send(String input) {

            System.out.print(input);

        }

    }



    public void bonus(PrizePool prizePool) {
        prizePool.send("A");

    }  // 仅能打印A，表示发放积分

    public void coupon(PrizePool prizePool) {
        prizePool.send("B");
    }  // 仅能打印B，表示发放优惠券

    public void contribution(PrizePool prizePool) {
        prizePool.send("C");
    }  // 仅能打印C，表示发放贡献值

}