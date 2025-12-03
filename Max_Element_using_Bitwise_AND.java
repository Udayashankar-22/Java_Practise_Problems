import java.util.*;
public class Main {
    static int maxBitwise(int a, int b) {
        int diff = a - b;
        int k = diff >> 31;  
        return a - (k & diff); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt(); 
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            max = maxBitwise(max, x);
        }
        System.out.println(max);
    }
}
