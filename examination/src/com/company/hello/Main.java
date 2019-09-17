package com.company.hello;



public class Main {

    public static int getDis(int[] A, int n) {
        // 定义两个数组, leftMin 和 rightMax, 其中 leftMin[i] 表示从 0 到 i 之间的最小值,
        // rightMax[i] 表示从 n-1 到 i 之间的最大值.
        // 之后利用 rightMax[i] - leftMin[i] 得到差的最大值

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        leftMin[0] = A[0];
        rightMax[n - 1] = A[n - 1];

        for (int i = 1; i < n; ++i) {
            if (leftMin[i - 1] < A[i]) {
                leftMin[i] = leftMin[i - 1];
            } else {
                leftMin[i] = A[i];
            }
        }

        for (int i = n - 2; i >= 0; --i) {
            if (rightMax[i + 1] > A[i]) {
                rightMax[i] = rightMax[i + 1];
            } else {
                rightMax[i] = A[i];
            }
        }

        int res = 0;
        for (int i = 0; i < n; ++i) {
            if (rightMax[i] - leftMin[i] > res) {
                res = rightMax[i] - leftMin[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDis(new int[]{1,3,2,0,1,6,8},7 ));
    }
}

