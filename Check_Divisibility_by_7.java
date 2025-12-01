import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if(a%7==0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}