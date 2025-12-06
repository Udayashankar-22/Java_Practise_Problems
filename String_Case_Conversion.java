import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >='a' && ch<='z'){
                sb.append((char)(ch - 'a'+'A'));
            }
            else if(ch >='A' && ch<='Z'){
                sb.append((char)(ch-'A'+'a'));
            }
            else 
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}