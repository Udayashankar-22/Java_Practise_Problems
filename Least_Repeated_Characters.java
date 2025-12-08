import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (freq[ch] < min) {
                    min = freq[ch];
                }
            }
        }
        boolean[] printed = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && freq[ch] == min && !printed[ch]) {
                sb.append(ch);
                printed[ch] = true;
            }
        }
        System.out.print(sb.toString());
    }
}
