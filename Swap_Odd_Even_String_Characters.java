import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length - 1;i+=2){
            char temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.print(new String(arr));
    }
}