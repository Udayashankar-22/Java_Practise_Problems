import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sm =  Integer.MAX_VALUE;
        for(int i=0;i<10;i++)
        {
            int num = obj.nextInt();
            if(num < sm)
            {
                sm=num;
            }
            
        }
        System.out.println(sm);
    }
}