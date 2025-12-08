import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int last = (int) n%10;
        int first = 0;
        while(n>0){
            first = n%10;
            n/=10;
        }
        System.out.println(last+first);
    }
}