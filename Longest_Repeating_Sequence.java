import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr=new int[n];
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
                    f=1;
                }
                if(c>s)
                {
                    s=c;
                }
            }
        }
        if(f==0)
        System.out.println("-1");
        else 
        {
            System.out.println(s);
        }
    }
    }