import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int fat = 1;
        for(int i=n;i>0;i--)
        {
            fat*=i;
        }
        System.out.println(fat);
    }
}