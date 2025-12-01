import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int l = obj.nextInt();
        int b = obj.nextInt();
        int h = obj.nextInt();
        int vol = (l*b*h);
        int area = 2*((l*b)+(l*h)+(b*h));
        System.out.println(area+" "+vol);
    }
}