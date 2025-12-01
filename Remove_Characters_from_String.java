import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s1 = obj.next();
        String s2 = obj.next();
        String str = "";
        for(int i=0;i<s1.length();i++)
        {
            boolean f = false;
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    f = true;
                    break;
                }
            }
            if(!f)
            str += s1.charAt(i);
        }
        
        if(str.equals(""))
            System.out.println("-1");
        else
            System.out.println(str);
        
    }
}