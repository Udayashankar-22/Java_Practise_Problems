import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       int l = obj.nextInt();
       int r=obj.nextInt();
       int sum=0;
       for(int i=l;i<=r;i++){
           if(i%2!=0){
               sum += i;
           }
       }
       System.out.println(sum);
    }
}