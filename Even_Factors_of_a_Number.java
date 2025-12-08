import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int c=0,f=0;
        for(int i=2;i<=n;i+=2){
            if(n%i==0){
                    arr[c++]=i;
                    f=1;
            }
        }
        if(f==0){
            System.out.print("-1");
        }
        else {
            for(int i=0;i<c;i++){
                System.out.print(arr[i]);
                if(i<c-1)System.out.print(" ");
            }
        }
    }
}