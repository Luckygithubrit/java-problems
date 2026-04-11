// question: Write a Java program to concatenate two strings by alternating their characters. If one string is longer than the other, append the remaining characters of the longer string at the end of the result.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 1st String");
	    String a=sc.nextLine();
	    System.out.println("enter the 2nd String");
	    String b=sc.nextLine();
	    String result="";
	    int i=0;
	    int j=0;
	    while(i<a.length()&&j<b.length()){
	        result=result+a.charAt(i);
	        result=result+b.charAt(j);
	        i++;
	        j++;
	    }
	    while(i<a.length()){
	        result=result+a.charAt(i);
	        i++;
	    }
	    while(j<b.length()){
	        result=result+b.charAt(j);
	        j++;
	    }
		System.out.println(result);
	}
}