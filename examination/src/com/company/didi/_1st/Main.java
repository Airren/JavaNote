package com.company.didi._1st;

import java.util.Scanner;
public class Main {
    public static int res=2;
    public static int n,m;
    public static int[][] gra;
    public static int[][] cun;
    public static int[] cnt;

    public static void solve(int id,int num){    //id表示学生，num表示当前考场的编号
        if(num>=res){              //当现在安排的数量已经大于了最小的教室数量的话，返回

            return;
        }
        if(id>n){                 //安排的学生已经大于所有的学生了，就是安排完所有的学生了已经
            res=Math.min(res,num);
            return;
        }
        for(int i=1;i<=num;i++){   //首先看看之前的房间里面能不能放进去
            int sz=cnt[i];
            int jishu=0;      //得到的是和这个人不认识的人数
            for(int j=1;j<=sz;j++){
                if(gra[id][cun[i][j]]==0){
                    jishu++;
                }
            }
            if(jishu==sz){   //如果这里面的学生都和现在遍历的都不认输
                cun[i][++cnt[i]]=id; //将这个学生存到这个考场中
                solve(id+1,num);
                cnt[i]--;
            }
        }
        //重新开一个房间
        cun[num+1][++cnt[num+1]]=id;  //没有的话就把它放到下一个教室里
        solve(id+1,num+1);
        --cnt[num+1];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        gra=new int[110][110];   //是否存在关系，存在关系就是1，不存在关系就是0
        cun=new int[110][110];   //第一维度表示的是考场，二位度里面放的是这个考场里面的学生
        //cun[1][1] = 2，cun[1][2] = 0;表示考场1里面第一个存在的人是2，然后后面一位是0，也就是不存在人了，那么这时的cun[1] = 1；表示的是考场里面人的数量
        cnt=new int[110];         //是cun数组存的是学生的数量
        while(m-- >0){
            int a = in.nextInt();
            int b = in.nextInt();
            gra[a][b]=gra[b][a]=1;
        }
        solve(1,0);
        int sum1 = 0;
        int sum;
    }
}

/*
5 2
1 4
3 4

 */