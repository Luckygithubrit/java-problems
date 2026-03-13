import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string");
	    String a=sc.nextLine();
	    String result=a.replaceAll("\\s+", "");
	    
	    System.out.println(result);
		
	}
}