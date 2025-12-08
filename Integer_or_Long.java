import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger intMax = BigInteger.valueOf(99999);
        if (n.compareTo(intMax) <= 0) {
            System.out.print("INT");
        } else {
            System.out.print("LONG");
        }
    }
}
