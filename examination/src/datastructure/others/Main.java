package datastructure.others;

import java.util.Hashtable;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str = "abcbcdebcab";

        int n = str.length();
        Set<Character> set = new TreeSet<>();

        Set<Character> res = new TreeSet<>();


        int i = 0;
        int j = 0;

        int start = 0;
        int  end = 0;
        while(i < n && j < n){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                if (res.size() < set.size()){
                    res = new HashSet<>(set);
                    start = i;
                    end = j;
                }
                j++;
            }else{
                set.remove(str.charAt(i));
                i++;
            }
        }


        for (int k = start; k <j ; k++) {
            System.out.print(str.charAt(k));
        }




    }
}

