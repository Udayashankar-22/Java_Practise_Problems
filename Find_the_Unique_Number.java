import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq = new int[256];
        int unq=0;
        for(int i=0;i<n;i++){
            freq[i]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]==1){
                System.out.println(freq[i]);
                break;
            }
        }
        
    }
}