import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int bal=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(')
            bal++;
            else 
            bal--;
            if(bal<0){
                System.out.print("no");
                return;
            }
            
    }
    if(bal==0)
    System.out.print("yes");
    else 
    System.out.print("no");
    }
}