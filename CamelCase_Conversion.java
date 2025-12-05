import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        StringBuilder ans = new StringBuilder();
        boolean upper = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                upper = true;
                continue;
            }
            if(upper){
                ans.append(Character.toUpperCase(ch));
                upper=false;
            }
            else 
            {
                ans.append(ch);
            }
        }
        System.out.print(ans.toString());
    }
}