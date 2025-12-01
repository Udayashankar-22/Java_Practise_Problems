import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int mul = a*b;
        int s =(int) Math.sqrt(mul);
        if((s*s)==mul)
        System.out.println("yes");
        else
        System.out.println("no");
        
    }
}