import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=obj.nextInt();
        Arrays.sort(arr);
        int[] ang = new int[n];
        int l=0,r=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ang[i]=arr[l++];
            }
            else {
                ang[i]=arr[r--];
            }
        }
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum += Math.max(ang[i],ang[i+1]);
        }
        System.out.println(sum);
    }
}