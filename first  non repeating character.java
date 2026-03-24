// question: Write a program to find the first non-repeating character in a given string.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String is:");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++){
		    int count=0;
		    char ch=a.charAt(i);
		    for(int j=0;j<a.length();j++){
		        if(ch==a.charAt(j)){
		            count++;
		        }
		    }
		    if(count==1){
		        System.out.println("first non repeating charactyer is: "+ch);
		    }
		}
// 		System.out.println();
	}
}