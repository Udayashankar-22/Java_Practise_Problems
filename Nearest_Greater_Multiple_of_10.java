import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int d = (n/10)+1;
        System.out.println(d*10);
        
    }
}