import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String bin = obj.next();
        long decimal=0;
        long base=1;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1'){
                decimal += base;
            }
            base *= 2;
        }
        System.out.println(decimal);
        
    }
}

//Using InBuilt function
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String bin = obj.next();
        long decimal = Long.parseLong(bin,2);
        System.out.println(decimal);
        
    }
}