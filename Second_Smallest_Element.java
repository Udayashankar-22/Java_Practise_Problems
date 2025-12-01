import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 2){
            System.out.println("-1");
            return;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int val = sc.nextInt();

            if(val < min1){
                min2 = min1;
                min1 = val;
            } else if(val > min1 && val < min2){
                min2 = val;
            }
        }

        if(min2 == Integer.MAX_VALUE){
            System.out.println("-1");
        } else {
            System.out.println(min2);
        }
    }
}
