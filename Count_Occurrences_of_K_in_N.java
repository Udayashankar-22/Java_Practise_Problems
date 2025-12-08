import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int count=0;
        while(n>0){
            int dig=n%10;
            if(dig==k){
            count++;}
            n/=10;
        }
        if(count==0)
        System.out.println("-1");
        else 
        System.out.println(count);
    }
}