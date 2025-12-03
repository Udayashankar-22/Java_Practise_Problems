import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String[] word = str.split(" ");
        for(int i=0;i<word.length;i++){
            String w = word[i];
            if(w.length()>2){
                String mid = w.substring(1,w.length()-1);
                String rev = new StringBuilder(mid).reverse().toString();
                word[i]=w.charAt(0)+rev+w.charAt(w.length()-1);
            }
        }
        System.out.println(String.join(" ",word));
    }
}