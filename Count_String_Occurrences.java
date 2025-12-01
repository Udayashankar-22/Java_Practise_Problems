import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sen = obj.nextLine();
        String s = obj.next();
         int c = 0;
         int index = 0;
         while((index = sen.indexOf(s, index)) != -1)
         {
             c++;
             index = index+s.length();
         }
         if(c==0)
         System.out.println(-1);
         else
         System.out.println(c);
    }
}
