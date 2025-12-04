import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String sstr = str.toLowerCase();
        switch(sstr){
            case "monday":System.out.println("no");
            break;
            case "tuesday":System.out.println("no");
            break;
            case "wednesday":System.out.println("no");
            break;
            case "thusdary":System.out.println("no");
            break;
            case "friday":System.out.println("no");
            break;
            case "saturday":System.out.println("yes");
            break;
            case "sunday":System.out.println("yes");
            break;
        }
    }
}