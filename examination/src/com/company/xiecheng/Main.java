package com.company.xiecheng;


import java.util.*;

public class Main {
    
    static boolean CheckBlackList(String userIP, String blackIP) {
        int flag = blackIP.indexOf("/");
        if (flag==-1){
           return userIP.equals(blackIP);
        }
        
        String[] ips = userIP.split("\\.");
        int ipAddr = (Integer.parseInt(ips[0]) << 24)
                | (Integer.parseInt(ips[1]) << 16)
                | (Integer.parseInt(ips[2]) << 8) | Integer.parseInt(ips[3]);
        int type = Integer.parseInt(blackIP.replaceAll(".*/", ""));
        int mask = 0xFFFFFFFF << (32 - type);
        String tmpIp = blackIP.replaceAll("/.*", "");
        String[] tmpIps = tmpIp.split("\\.");
        int tmpIpsAddr = (Integer.parseInt(tmpIps[0]) << 24)
                | (Integer.parseInt(tmpIps[1]) << 16)
                | (Integer.parseInt(tmpIps[2]) << 8)
                | Integer.parseInt(tmpIps[3]);

        return (ipAddr & mask) == (tmpIpsAddr & mask);
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean res;
        String userIP = sc.next();
        String blackIP = sc.next();



        res = CheckBlackList(userIP, blackIP);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
