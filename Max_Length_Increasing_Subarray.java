import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       int n = obj.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i]=obj.nextInt();
       }
       int maxl=1;
       int curlen=1;
       for(int i=1;i<n;i++){
           if(arr[i]>arr[i-1]){
               curlen++;
           }else{
           maxl=(int)Math.max(maxl,curlen);
           curlen=1;
           }
       }
       maxl=(int)Math.max(maxl,curlen);
     if(maxl==1)
    System.out.println("-1");
    else 
    System.out.println(maxl);
    }
    
}