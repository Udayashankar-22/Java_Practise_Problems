import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                System.out.print("no");
                return;
            }
        }
        System.out.print("yes");
        
    }
}