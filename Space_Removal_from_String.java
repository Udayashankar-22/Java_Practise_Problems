import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
        }
        String ans = sb.toString().trim();
        System.out.println(ans);
    }
}