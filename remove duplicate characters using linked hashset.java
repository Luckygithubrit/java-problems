import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	   // String arr[]=new int[a];
	    
	    
	    LinkedHashSet<Character>lucky=new LinkedHashSet<>();
	    for(char num:a.toCharArray()){
	        lucky.add(num);
	    }
	    for(char num:lucky){
	        System.out.print(num);
	    }
		
	}
}