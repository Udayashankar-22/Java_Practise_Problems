import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int f=0,val=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                val=i;
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("-1");
        else 
        System.out.println(val+1);
    }
}