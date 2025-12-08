import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int ans=1;
        for(int i=0;i<k;i++){
            ans *= (n-i);
        }
        System.out.println(ans);
    }
}