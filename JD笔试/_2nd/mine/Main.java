package _2nd;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] relation = new int [2*n+1][2*n+1];
            Map<Integer,Integer> map = new TreeMap<>();
            for (int i = 0; i < m; i++) {
                int first= sc.nextInt();
                int next = sc.nextInt();
                if ((first <=n && next> n)||(first > n && next<=n)) {
                    relation[first][next]=1;
                    relation[next][first]=1;
                    map.put(first,map.getOrDefault(first,0)+1);
                    map.put(next,map.getOrDefault(next,0)+1);
                }
            }
            Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    if(o1.getValue().compareTo(o2.getValue())==0) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    return o2.getValue().compareTo(o1.getValue());
                }
            };
            List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
            Collections.sort(list,comparator);
            List<Integer> result = new ArrayList<>();
            while (!list.isEmpty()) {
                Map.Entry<Integer,Integer> entry = list.get(0);
                int temp1 = entry.getKey();
                result.add(temp1);
                for (int i = 0; i < 2*n+1; i++) {
                    if(relation[temp1][i]!=0 && map.containsKey(i)) {
                        map.put(i,map.get(i)-1);
                        if (map.get(i)==0){
                            map.remove(i);
                        }
                    }
                }
                map.remove(temp1);
                list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
                Collections.sort(list,comparator);
            }
            System.out.println(result.size());
            Collections.sort(result);
            for (int i = 0; i < result.size()-1; i++) {
                System.out.println(result.get(i)+" ");
            }
            System.out.println(result.get(result.size()-1));
        }
    }
}