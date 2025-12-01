import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int[] fin = new int[n];
        int c = 0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                fin[c++]=arr[i];
            }
            else 
            fin[c++]=arr[i+1];
        }
        for(int i=0;i<c-1;i++)
        {
            System.out.print(fin[i]+" ");
        }
        System.out.print(fin[c-1]);
    }
}