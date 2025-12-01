import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        char k = obj.next().charAt(0);
        int po =0;
        boolean f = false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == k)
            {
                po = i+1;
                f = true;
                break;
                
            }
        }
        if(f == true)
        System.out.println(po);
        else
        System.out.println("-1");
        
    }
}