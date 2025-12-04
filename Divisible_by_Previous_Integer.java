import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int c=0;
        int[] fin = new int[n];
        for(int i=1;i<n;i++)
        {
            if(arr[i]%arr[i-1]==0)
            {
                fin[c++]=arr[i];
            }
        }
        if(c == 0) {
            System.out.println();
            return;
        }
        for(int i = 0; i < c; i++) {
            System.out.print(fin[i]);
            if(i < c - 1) System.out.print(" ");
        }
    }
}