package _1st;

import java.util.*;


class Stu{
    int id;
    int height;

    public Stu(int id, int height){
        this.id = id;
        this.height = height;
    }
    @Override
    public String toString(){
        return  this.id+": height: "+this.height+" ";
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Stu> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Stu(i+1,sc.nextInt()));
        }

        Collections.sort(list, Comparator.comparingInt(o -> o.height));
        List<List<Stu>> resList = new ArrayList<>();
        int before = 0;
        List<Stu> tmp = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Stu stu = list.get(i);
            set.add(stu.id);
            Collections.sort(set);
            tmp.add(stu);

            if (setContinue(set) && set !=null &&set.get(0) == before +1 ){
                resList.add(new ArrayList<>(tmp));
                before = set.get(set.size()-1);
                tmp.clear();
                set.clear();

            }

        }

        System.out.print(resList.size());

    }

    public static boolean setContinue(List<Integer> set){
        if (set==null || set.size()==0) return false;
        int min = set.get(0);
        int max = set.get(set.size()-1);
        if (((max-min + 1 )/set.size())==1|| set.size()==1){
            return true;
        }else {
            return false;
        }

    }
}


/*
 Input:
 4 
 2 1 3 2

 OutPut:
 2
 */