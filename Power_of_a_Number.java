import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        if (n < 1 || k < 2) {
            System.out.println("no");
            return;
        }
        while (n % k == 0) {
            n = n / k;
        }
        if (n == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
