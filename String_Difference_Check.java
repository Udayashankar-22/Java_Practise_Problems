import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int k = sc.nextInt();
        if(str.length()!=str1.length()){
            System.out.print("no");
            return;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i))
                count++;
        }
        if(count==k)
        System.out.print("yes");
        else 
        System.out.print("no");
    }
}