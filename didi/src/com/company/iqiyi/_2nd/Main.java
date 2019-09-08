//package com.company.iqiyi._2nd;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
////    public static  double winA = 0;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int red = in.nextInt();
//        int blue = in.nextInt();
//
//        System.out.println();
//    }
//
//
//
//
//    public static double getWinA( double red, double blue, boolean c){
//        double winA = 0;
//        double winC = 0, loseC = 0, loseA = 0, loseB = 0;
//        if (red > 0) {
//            // 如果A第一次就赢
//            winA += red/(red + blue );
//
//            if (blue>0){
//                 loseA = blue--/(red + blue );
//            }
//            if (blue>0){
//                 loseB = blue-- /(red + blue );
//            }
//
//            if (red>0){
//                c = true;
//                 winC = red-1/(red + blue );
//            }
//            if (blue>0){
//                c = false;
//                 loseC = blue-1/(red + blue );
//            }
//            winA+= loseA*loseB*loseC*getWinA(red,blue,);
//
//            winA+= loseA*loseB*winC;
//
//
//
//        }
//        return winA;
//
//
//
//
//
////        if (blue >3){
////            winA += blue/(red + blue)* (blue-1)/(red + blue-1)* (blue-2)/(red + blue-2)*getWinA(red,blue-3);
////        }if (blue>2){2
////
////        }
////
//
//
//
//
//
//
//        // 如果A 拿到蓝色 B 拿到红色
//
//
//        // 如果A 拿到蓝色 B 拿到蓝色 C拿到蓝色
//
//        // 如果A 蓝色 B蓝色 C红色
//
//
//
//
//
//
//
//        return winA;
//    };
//}
//
//
