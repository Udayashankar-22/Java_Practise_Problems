import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr=new int[n];
        int[] fin=new int[n];
        int f=0,s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==k)
            {
                fin[s++]=arr[i];
                f=1;
            }
        }
        if(f==0)
        System.out.println("-1");
        else 
        {
            for(int i=0;i<s-1;i++)
            {
                System.out.print(fin[i]+" ");
            }
            System.out.print(fin[s-1]);
        }
    }
    } 