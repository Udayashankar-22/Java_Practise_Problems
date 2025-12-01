import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int f=0;
        for(int i=3;i<=9;i++)
        {
            if(num%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println("no");
        else
        System.out.println("yes");
    }
}