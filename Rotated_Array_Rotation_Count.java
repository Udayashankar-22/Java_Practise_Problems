import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int minval = arr[0];
        int mindx = 0;
        for(int i=1;i<n;i++){
            if(arr[i]<minval){
                minval=arr[i];
                mindx=i;
            }
        }
        if(mindx==0)
        System.out.println("-1");
        else 
        System.out.println(mindx);
        
        
    }
}