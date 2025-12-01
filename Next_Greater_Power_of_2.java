import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int p=1;
        while(p<=a)
        {
            p*=2;
        }
        System.out.println(p);
    }
}