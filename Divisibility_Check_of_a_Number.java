import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n =obj.nextInt();
        for(int i=n-1;i>=2;i--){
            if(n%i==0){
                System.out.print("yes");
                return;
            }
        }
        System.out.println("no");
    }
}