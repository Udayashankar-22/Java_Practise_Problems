import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String str1 = obj.next();
        int dif=0;
        if(str.length()!=str1.length()){
            System.out.print("no");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str1.charAt(i)){
                dif++;
            }
        }
        if(dif==1)
        System.out.print("yes");
        else 
        System.out.print("no");
        
    }
}