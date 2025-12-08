import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n>0 && (n & (n-1))==0)
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}