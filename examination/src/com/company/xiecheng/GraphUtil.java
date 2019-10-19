package com.company.xiecheng;

public class GraphUtil<T> {

    public static double[][] getDijkstraGraph(){
        double max=Double.MAX_VALUE;
        double[][] graph={
                {max,5,max,7,15},
                {max,max,5,max,max},
                {max,max,max,max,1},
                {max,max,2,max,max},
                {max,max,max,max,max}
        };
        return  graph;
    }
}