import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the String:");
	    String a=sc.nextLine();
	    String b="";
	    for(int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        if(Character.isUpperCase(ch)){
	            b=b+Character.toLowerCase(ch);
	        }
	        else if(Character.isLowerCase(ch)){
	            b=b+Character.toUpperCase(ch);
	        }
	        else if(ch=='0'){
	            b=b+'1';
	        }
	        else if(ch=='1'){
	            b=b+'0';
	        }
	        else{
	            b=b+ch;
	        }
	    }
		System.out.println("toggle String is: "+b);
	}
}