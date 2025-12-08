import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        int k=obj.nextInt();
        int l=str.length();
        k=k%l;
        String ans = str.substring(k)+str.substring(0,k);
        System.out.println(ans);
    }
}