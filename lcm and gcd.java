import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=a;
		int y=b;
		while(b!=0){
		    int temp=b;
		    b=a%b;
		    a=temp;
		}
        int gcd=a;
        int lcm=(x*y)/gcd;
		System.out.println(lcm);
		
		
	}
}