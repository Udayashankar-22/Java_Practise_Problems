import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "kabali";
        int count=0;
        int[] freq = new int[256];
        for(char c:str.toCharArray()){
            freq[c]++;
        }
        for(int i=0;i<n;i++){
            String w = sc.next();
            if(w.length()!=str.length())continue;
            int[] fr = new int[256];
            for(char ch:w.toCharArray()){
                fr[ch]++;
            }
            boolean ana = true;
            for(int j=0;j<256;j++){
                if(freq[j]!=fr[j]){
                    ana = false;
                    break;
                }
            }
            if(ana)count++;
        }
        System.out.println(count);
        
    }
}