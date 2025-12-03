import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int dif=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int f=arr[i]-arr[j];
                if(f>dif){
                    dif=f;
                }
            }
        }
        System.out.println(dif);
    }
}