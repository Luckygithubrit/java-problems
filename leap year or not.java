import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the year");
	    int a=sc.nextInt();
	    if((a%4==0&&a%100!=0)||a%400==0){
	        System.out.println("it is a leap year");
	    }
	    else{
	        System.out.println("not a leap year");
	    }


	}
}