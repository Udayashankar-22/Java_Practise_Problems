import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int c=0;
        char[] arr = str.toCharArray();
        for(char ch:arr)
        {
            c++;
        }
        System.out.println(c);
    }
}