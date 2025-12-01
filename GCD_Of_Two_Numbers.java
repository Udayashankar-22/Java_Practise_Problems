import java.util.Scanner;
public class Main {
    public static int gcd(int a,int b){
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
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        if(n1!=0 && n2!=0){
        int gcd = gcd(n1,n2);
        System.out.println(gcd);}
        else
        System.out.println(-1);
        
    }
}