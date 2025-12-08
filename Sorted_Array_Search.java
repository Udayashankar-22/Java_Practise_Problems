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
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.print("yes");
                return;
            }
        }
        System.out.print("no");
    }
}