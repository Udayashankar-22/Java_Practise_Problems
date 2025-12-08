import java.util.Scanner;
public class Main {
    static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = fact(n) / (fact(k) * fact(n - k));
        System.out.print(result);
    }
}
