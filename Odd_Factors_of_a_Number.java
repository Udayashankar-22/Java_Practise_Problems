import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       int n=obj.nextInt();
       int[] arr = new int[n];
       int c=0;
       for(int i=1;i<=n;i+=2){
           if(n%i==0){
               arr[c++]=i;
           }
       }
       for(int i=0;i<c;i++){
           System.out.print(arr[i]);
           if(i<c-1)System.out.print(" ");
       }
    }
}