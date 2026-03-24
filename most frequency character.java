// question: Write a program to find the most frequent character in a given string.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String is:");
		String a=sc.nextLine();
		int max=0;
		char maxchar=' ';
		for(int i=0;i<a.length();i++){
		    int count=0;
		    char ch=a.charAt(i);
		    for(int j=0;j<a.length();j++){
		        if(ch==a.charAt(j)){
		            count++;
		        }
		    }
		    if(count>max){
		        max=count;
		        maxchar=a.charAt(i);
		        
		    }
		    
		}
		System.out.println("max coutn:"+max);
		System.out.println("most frequencr character:"+maxchar);
// 		System.out.println();
	}
}