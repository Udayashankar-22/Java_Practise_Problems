import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int ans=obj.nextInt();
        for(int i=1;i<n;i++){
            int a=obj.nextInt();
            ans=ans|a;
        }
        System.out.println(ans);
    }
}