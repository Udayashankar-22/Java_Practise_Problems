import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int[][] pair = new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0] = arr[i];   
            pair[i][1] = i+1;
        }
        Arrays.sort(pair, Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<n;i++){
            System.out.print(pair[i][1]);
            if(i < n-1) System.out.print(" ");
        }
    }
}
