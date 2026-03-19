import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the first number:");
	    
	    int a=sc.nextInt();
	    System.out.println("enter the second number");
	    int b=sc.nextInt();
	   // String arr[]=new int[a];
	   while(b!=0){
	       int temp=b;
	       b=a%b;
	       a=temp;
	   }
	   System.out.println("gcd of "+a+" and "+b+" is : "+a);
	    
	    
		
	}
}