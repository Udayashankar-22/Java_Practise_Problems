import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int l = obj.nextInt();
        int r = obj.nextInt();
        if(n>l && n<r)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}