import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>0 && b>0 && c>0 && (a+b+c)==180)
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}