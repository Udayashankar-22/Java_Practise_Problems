import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count = 1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>2)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}