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
        int[] p1=new int[n*n];
        int[] p2=new int[n*n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int f =0;
                    for(int k=0;k<c;k++)
                    {
                        if(p1[k]==arr[i] && p2[k]==arr[j])
                        {
                            f=1;
                            break;
                        }
                    }
                    if(f==0)
                    {
                        p1[c]=arr[i];
                        p2[c]=arr[j];
                        c++;
                    }
                }
                
            }
        }
        if(c==0)
        System.out.println("-1");
        else 
        System.out.println(c);
    }
}