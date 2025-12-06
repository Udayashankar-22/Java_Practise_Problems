import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        boolean spc = false;
        StringBuilder strb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                strb.append(ch);
                spc = false;
            }
            else {
                if(!spc){
                    strb.append(' ');
                    spc = true;
                }
            }
        }
        String ans = strb.toString().trim();
        System.out.print(ans);
    }
}