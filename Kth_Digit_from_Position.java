import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int len = n.length();
        int ind = p + k - 1;   
        System.out.print(n.charAt(ind));
    }
}
