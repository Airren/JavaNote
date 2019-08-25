import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        sc.nextLine();
        int len = 2*n +1;
        int[] du = new int[len];
        int count = m;
        boolean[][] relation = new boolean[len][len];
        for (int i = 0; i < m; i++) {
            String[] str = sc.nextLine().split(" ");
            int val1 = Integer.valueOf(str[0]);
            int val2 = Integer.valueOf(str[1]);
            int boy = Math.min(val1, val2);
            int girl = Math.max(val1, val2);
            relation[boy][girl] = true;
            du[boy]++;
            du[girl]++;
        }
        LinkedList<Integer> result = new LinkedList<>();
        while(count>0){
            int[] tempdu = Arrays.copyOf(du,len);
            Arrays.sort(tempdu);
            int maxdu = tempdu[len-1];
            if(maxdu==0){
                break;
            }
            for (int i = 1; i < len; i++) {
                if(du[i]==maxdu){
                    for (int j = n; j < len; j++) {
                        if(relation[i][j]){
                            relation[i][j]=false;
                            du[i]--;
                            du[j]--;
                            count--;
                        }
                    }
                    result.add(i);
                }
            }
        }
        int alen = result.size();
        System.out.println(alen);
        for (int i = 0; i < alen; i++) {
            System.out.print(result.get(i));
            if(i==alen-1){
                System.out.print(" ");
            }
        }
    }
}