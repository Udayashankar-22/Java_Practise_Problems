import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        if(n==0){
            System.out.print("0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        System.out.println(sb.reverse().toString());
    }
}

//Using InBuilt function
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(Integer.toBinaryString(n));
    }
}