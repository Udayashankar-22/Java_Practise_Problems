import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<m;i++){
            arr1[i]=obj.nextInt();
        } 
        int count=0;
        int[] merge=new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=arr[i];
        }
        for(int i=0;i<m;i++){
            merge[n+i]=arr1[i];
        }
        Arrays.sort(merge);
        for(int i=0;i<(n+m);i++){
            System.out.print(merge[i]);
            if(i<(n+m)-1)System.out.print(" ");
        }
        
    }
}