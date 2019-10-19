package com.company.ebay;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int n = Integer.parseInt(in.split(" ",2)[0].trim());
        int W = Integer.parseInt(in.split(" ",2)[1].trim());
        int i =0;
        int[] weights = new int[n];
        while (i < n){
            weights[i++] = Integer.parseInt(sc.nextLine());
        }

        /*for (int weight : weights) {
            System.out.println(weight);
        }*/

        Arrays.sort(weights);
        int count = 0;
        int j = 0, k = weights.length-1;
        while (j < k){
            if (weights[j] + weights[k] <= W){
                count++;
                j++;
                k--;
            }else if (weights[j] + weights[k] > W){
                k--;
            }
        }
        int result = count + (n- 2*count);

        System.out.println(result);
    }
}