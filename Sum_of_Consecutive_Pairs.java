import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=obj.nextInt();
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum += (arr[i]+arr[i+1]);
        }
        System.out.println(sum);
    }
}