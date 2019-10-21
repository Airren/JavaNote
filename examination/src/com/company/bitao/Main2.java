package com.company.bitao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Long,Integer> mp = new HashMap<>();
//        int N = Integer.MAX_VALUE;
        int n, m,t;
        long x,y;
        m = 1;
//        int[] a = new int[12];
        long[]  b = new long[100];
        long[] c = new long[100];
        n=sc.nextInt();
        int[] a = new int[n];
        int d=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            a[i]= d;
            m *= a[i];
        }

        int ans = 0;
        for (int i = 1; i <=m  ; i++) {
            x = 0;
            for (int j = 1; j <= n ; j++) {
                y = sc.nextInt();
                x = x*10+y;
            }
            b[i]= (int) x;
            mp.put(x,i);
            x = 0;
            for (int j = 1; j <=n; j++) {
                y = sc.nextInt();
                x = x*10+y;
            }
            c[i] = x;
        }

        t = sc.nextInt();
        int pos;
        for (int i = 1; i <= m ; i++) {
            if (b[i]==c[i]) {
                continue;
            }
            ans++;
            pos = mp.get(c[i]);
            mp.put(b[i],pos) ;
            long tmp = b[pos];
            b[pos] = b[i];
            b[i] = tmp;

        }
        if (ans<=t && (t-ans)%2==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
/*
1 1
1
1
1

 */

/*
2 2
1 2
2 1
1 1
2 2
2 1
1 2
2 2
1 1
2

 */

