import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int a = sc.nextInt();
        if (p % 2 != 0) {
            System.out.println("no");
            return;
        }
        int sum = p/2;
        boolean f = false;
        for (int l=1;l<=sum;l++) {
            int b=sum-l;
            if (l*b == a) {
                f=true;
                break;
            }
        }
        if (f) 
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}
