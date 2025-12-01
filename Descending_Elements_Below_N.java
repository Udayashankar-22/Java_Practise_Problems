import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        int[] fin=new int[n];
        int f=0,c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<n)
            {
                fin[c++]=arr[i];
                f=1;
            }
        }
        if(f==0)
        {
            System.out.print("-1");
        }
        else 
        {
            for(int i = c - 1; i >= 0; i--) {
                System.out.print(fin[i]);
                if(i > 0) System.out.print(" ");
        }
    }
    }
}