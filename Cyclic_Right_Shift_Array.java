import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        k=k%n;
        for(int i=n-k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(arr[i]);
            if(i<(n-k)-1)System.out.print(" ");
        }
    }
}