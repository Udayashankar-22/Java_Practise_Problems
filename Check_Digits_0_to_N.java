import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String n = obj.next();   
        int k = obj.nextInt();
        boolean[] present = new boolean[10];
        for (int i = 0; i < n.length(); i++) {
            int d = n.charAt(i) - '0';
            present[d] = true;
        }
        boolean f = true;
        for (int i = 0; i <= k; i++) {
            if (!present[i]) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
