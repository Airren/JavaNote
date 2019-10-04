package com.company.vivo._3rd;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int sum = (int) list.stream().count();


        
        System.out.println(sum);
    }
}
