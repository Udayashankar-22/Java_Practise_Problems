import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String str1 = obj.next();
        if(str.length()!=str1.length()){
            System.out.println("-1");
            return;
        }
        int[] a = new int[256];
        int[] b = new int[256];
        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str1.charAt(i);
                if(a[ch1]==0 && b[ch2]==0){
                    a[ch1]=ch2;
                    b[ch2]=ch1;
                }
                else if(a[ch1]!=ch2){
                    System.out.print("no");
                    return;
                }
        }
        System.out.print("yes");
    }
}