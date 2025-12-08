import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            ch = (char)(((ch-'A'+3)%26)+'A');
            sb.append(ch);
        }
        System.out.print(sb.toString());
    }
}