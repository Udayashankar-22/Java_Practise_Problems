import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        int count=0;
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
        if(freq[i]==1){
            count++;
            }
        }
        if(count==0)
        System.out.println("-1");
        else 
        System.out.println(count);
    }
}