import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evec = 0, oddc = 0;
        int oddv = -1, evev = -1;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                evec++;
                evev = arr[i];
            } else {
                oddc++;
                oddv = arr[i];
            }
        }
        if(evec == 1)
            System.out.println(evev);
        else if(oddc == 1)
            System.out.println(oddv);
        else
            System.out.println(-1);
    }
}
