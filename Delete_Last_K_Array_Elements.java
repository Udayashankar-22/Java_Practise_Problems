import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int s = n-k;
        for(int i=0;i<s-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[s-1]);
    }
}