import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String str1 = obj.next();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str1.length();j++)
            {
                if(str.charAt(i)==str1.charAt(j))
                {
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
        
    }
}