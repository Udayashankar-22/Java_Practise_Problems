import java.util.Scanner;
public class Main {
    public static int GCD(int a,int b){
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int l = obj.nextInt();
        int r = obj.nextInt();
        int g = GCD(l,r);
        int lcm = l*r/g;
        System.out.print(lcm);
    }
}