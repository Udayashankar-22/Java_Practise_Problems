import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean found = false;
        boolean first = true;
        for(int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if(Character.isDigit(ch)){
                int d = ch - '0';
                if(d % 2 != 0){
                    if(!first){
                        System.out.print(" ");
                    }
                    System.out.print(d);
                    first = false;
                    found = true;
                }
            }
        }
        if(!found){
            System.out.print("-1");
        }
    }
}
