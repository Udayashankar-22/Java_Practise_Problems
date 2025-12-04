import java.util.Scanner;
public class Main {
    static Boolean isprime(int x){
        if(x==2)return true;
        if(x<2)return false;
        if(x%2==0)return false;
        for(int i=3;i*i<=x;i+=2){
            if(x%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}