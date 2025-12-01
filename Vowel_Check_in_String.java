import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String vo = "aeiouAEIOU";
        int f=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<vo.length();j++)
            {
                if(str.charAt(i)==vo.charAt(j))
                {
                    f=1;break;
                }
            }
        }
        if(f==1)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}