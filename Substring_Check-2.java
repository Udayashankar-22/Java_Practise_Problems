import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        if(str.contains(s))
        System.out.println("yes");
        else 
        System.out.println("no");
    }
}