import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int find=sc.nextInt();
int left = 0, right =n - 1;

while(left<=right){
   int mid = left+(right-left)/2;
   if(arr[mid]==find)
   {
       System.out.println(mid);
       return;
   }
   else if(find<arr[mid])
   {
       right = mid-1;
   }
   else if(find>arr[mid])
   {
       left = mid+1;
   }
}
   System.out.println("-1");
}
}