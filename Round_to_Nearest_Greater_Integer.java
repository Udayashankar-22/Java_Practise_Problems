import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float num = obj.nextFloat();
        int n = (int)Math.ceil(num);
        System.out.println(n);
    }
}