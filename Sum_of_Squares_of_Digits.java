import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum += dig*dig;
            n/=10;
        }
        System.out.println(sum);
    }
}