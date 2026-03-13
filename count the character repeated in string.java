// this program is to count the character repeated in string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string");
	    String a=sc.nextLine();
	    System.out.println("enter the char");
	    char ch=sc.nextLine().charAt(0);
	   // sc.nextLine();
	    int count=0;
	   // System.out.println(a.isEmpty());
	    
	    for(char c:a.toCharArray()){
	        if(ch==c){
	            count++;
	        }
	    }
	    
	    System.out.println("result is:"+count);
		
	}
}