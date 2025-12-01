import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int min = n+1;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                int q = n/i;
                if(q%2!=0)
                {
                    System.out.println(i);
                    return;
                }
            }
        }
        
    }
}