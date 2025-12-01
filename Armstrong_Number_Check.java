import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int powerSum = 0;
		int numlen = String.valueOf(num).length();
		while(temp>0)
		{
		    int dig = temp%10;
		    powerSum +=(int)Math.pow(dig,numlen);
		    temp/=10;
		}
		if(powerSum==num)
		System.out.println("Armstrong Number");
		else 
		System.out.println("Not an Armstrong Number");
	}
}
