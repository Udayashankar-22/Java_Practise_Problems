import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        while(n>0)
        {
            int dig=n%10;
            if(dig>0)
            System.out.print(dig);
            n/=10;
        }
    }
}