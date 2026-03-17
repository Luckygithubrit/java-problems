import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++){
		    int count=1;
		    if(a.charAt(i)=='0'){
		        continue;
		    }
		    for(int j=i+1;j<a.length();j++){
    		    if(a.charAt(i)==a.charAt(j)){
    		        count++;
    		    }
    		}
    		System.out.println(a.charAt(i)+"-"+count);
		}
    		
		
	}
}