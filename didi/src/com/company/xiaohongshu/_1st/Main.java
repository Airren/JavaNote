package com.company.xiaohongshu._1st;


import java.util.Scanner;


class UnionFind {

    private int num;
    private int[] parent;

    private int[] rank;

    public UnionFind(int n) {
        this.num = n;
        this.parent = new int[n];
        this.rank = new int[n];
        for (int i = 0; i < n; i++) {
            this.parent[i] = i;
            this.rank[i] = 1;
        }
    }

    public int getCount() {
        return this.num;
    }

    public int find(int p) {

        while (p != this.parent[p]) {

            this.parent[p] = this.parent[this.parent[p]];
            p = this.parent[p];
        }
        return p;
    }


    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }

        if (rank[pRoot] > rank[qRoot]) {
            parent[qRoot] = pRoot;
        } else if (rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        } else {
            parent[qRoot] = pRoot;
            rank[pRoot]++;
        }

        num--;
    }
}

public class Main {

    public static int getCircleNum(int[][] M) {
        int len = M.length;
        UnionFind unionFind = new UnionFind(len);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.getCount();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arry = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arry[i][j] = sc.nextInt();
            }

        }

        int res = getCircleNum(arry);
        System.out.println(res);
    }
}




/*
3
1 1 0
1 1 0
0 0 1
 */