import java.util.Scanner;
public class Main {
    static boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i*i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                if(isprime(i) && isprime(j)){
                    f=true;
                    if(j>i)
                    System.out.println(j+" "+i);
                    else 
                    System.out.println(i+" "+i);
                    break;
                }
            }
        }
        if(!f)
        System.out.println("-1");
    }
}