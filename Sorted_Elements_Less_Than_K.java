import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];
        int[] fin = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int f=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<k)
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
            for(int i=0;i<c-1;i++)
            {
                System.out.print(fin[i]+" ");
            }
            System.out.print(fin[c-1]);
        }
    }
}