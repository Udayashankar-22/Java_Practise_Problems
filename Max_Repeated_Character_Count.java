import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')continue;
            freq[str.charAt(i)]++;
            if(freq[str.charAt(i)]>max){
                max=freq[str.charAt(i)];
            }
        }
        if(max>=2)
        System.out.print(max);
        else 
        System.out.print("0");
        
    }
}