import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int len = s.length();
        StringBuilder ud = new StringBuilder(s);
        if(len%2!=0)
        {
            int a = len/2;
            ud.setCharAt(a,'*');
        }
        else
        {
            int b = len/2 -1;
            int c = len/2;
            ud.setCharAt(b,'*');
            ud.setCharAt(c,'*');
        }
        String res = ud.toString();
        System.out.println(res);
    }
}