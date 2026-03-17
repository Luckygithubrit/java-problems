import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string");
	    String a=sc.nextLine();
	    for(int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        int ascii=(int)ch;
	        System.out.println("asccii value of "+ch+" is:"+ascii);
	        
	    }
		
	}
}