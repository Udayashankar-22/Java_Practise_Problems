import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        int len = str.length();
         int f=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(len-i-1);
           
            if(ch!=ch1)
            {
                f=1;break;
                
            }
        }
        if(f==1)
        System.out.println("no");
        else
        System.out.println("yes");
    }
}