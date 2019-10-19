package com.company.xiecheng;



import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Main3 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
    ******************************开始写代码******************************/
    static int DynamicPathPlanning(int[][] matrixGrid) {
        int[][] ways = new int[matrixGrid.length][matrixGrid[0].length];
        int i = 0;
        int j = 0;
        for (i = 0; i < matrixGrid.length; i++) {
            for (j = 0; j < matrixGrid[0].length; j++) {
                if (matrixGrid[i][j] == 1) {
                    ways[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    ways[i][j] = 1;
                } else if (i == 0 && j > 0) {
                    ways[i][j] = ways[i][j - 1];
                } else if (j == 0 && i > 0) {
                    ways[i][j] = ways[i - 1][j];
                } else {
                    ways[i][j] = ways[i - 1][j] + ways[i][j - 1];
                }

            }
        }
        return ways[i - 1][j - 1];


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _matrixGrid_rows = 0;
        int _matrixGrid_cols = 0;
        _matrixGrid_rows = Integer.parseInt(in.nextLine().trim());
        _matrixGrid_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _matrixGrid = new int[_matrixGrid_rows][_matrixGrid_cols];
        for(int _matrixGrid_i=0; _matrixGrid_i<_matrixGrid_rows; _matrixGrid_i++) {
            for(int _matrixGrid_j=0; _matrixGrid_j<_matrixGrid_cols; _matrixGrid_j++) {
                _matrixGrid[_matrixGrid_i][_matrixGrid_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = DynamicPathPlanning(_matrixGrid);
        System.out.println(String.valueOf(res));

    }
}
