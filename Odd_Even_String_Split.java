import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String odd = "";
        String even = "";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                odd +=str.charAt(i);
            }
            else
            {
                even +=str.charAt(i);
            }
        }
        System.out.println(odd+" "+even);
    }
}