import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int pre = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=pre)
            {
                System.out.println(arr[k-1]);
                return;
            }
            else
            System.out.println("-1");
            break;
        }
    }
}