import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int s = (int)Math.ceil(Math.sqrt(l));
        int e = (int)Math.floor(Math.sqrt(r));
        int count = e-s + 1;
        if(count>0)
        System.out.print(count);
        else 
        System.out.print("-1");
        
    }
}