// question: Write a Java program to toggle the case of each character in a given string.

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
	        else{
	            b=b+Character.toUpperCase(ch);
	        }
	    }
		System.out.println("toggle String is: "+b);
	}
}