import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int idx = -1;
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                count++;
                idx = i;
            }
        }
        if(count == 0 || count > 1){
            System.out.println("-1");
            return;
        }
        if(idx == 0 || arr[idx - 1] <= arr[idx + 1]){
            System.out.println(idx);
        } else {
            System.out.println(idx + 1);
        }
    }
}
