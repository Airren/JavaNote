import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        long[] val = new long[n];
        for (int i = 0; i < n; i++) {
            val[i] = Long.valueOf(str[i]);
        }
        int[] positions = new int[n];
        int count = 0;
        int index = 0;
        while(index< n-1){
            long min = Long.MAX_VALUE;
            int i = index;
            for (; i < n; i++) {
                if(min> val[i]){
                    min = val[i];
                    positions[count]= i;
                }
            }
            if(positions[count]==index){
                index = index+1;
            }else{
                index = positions[count]+1;
            }
            count++;
        }
        System.out.println(count);
    }
}