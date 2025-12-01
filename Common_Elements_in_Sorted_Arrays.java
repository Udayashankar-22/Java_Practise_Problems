import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] fin = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=obj.nextInt();
        }
        int f=0,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    fin[c++]=arr1[i];
                    f=1;
                }
            }
        }
        if(f==0)
        System.out.println("-1");
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