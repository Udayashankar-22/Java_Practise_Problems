import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long n = obj.nextLong();  
        int[] freq = new int[10];
        boolean f = false;
        while (n > 0) {
            int dig =(int)n%10;
            freq[dig]++;
            if (freq[dig]>1) {
                f=true;
                break;
            }
            n/=10;
        }
        if (f)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
