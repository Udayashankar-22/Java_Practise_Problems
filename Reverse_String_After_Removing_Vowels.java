import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String vowel = "aeiouAEIOU";
        StringBuilder op = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vowel.indexOf(ch)==-1){
                op.append(ch);
            }
        }
        if(op.length()==0){
            System.out.println("-1");
            return;
        }
        System.out.print(op.reverse().toString());
        
        
    }
}