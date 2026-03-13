import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("start:");
	    
	    int start=sc.nextInt();
	    System.out.println("end:");
	    
	    int end=sc.nextInt();
	    for(int num=start;num<=end;num++){
	        boolean prime=true;
	    
    	    for(int i=2;i<=Math.sqrt(num);i++){
    	        if(num%i==0){
    	            prime=false;
    	            break;
    	            
    	        }
    	    }
    	    if(!prime){
    	        System.out.println(num+" ");
    	    }
	    }
	    
	    
		
	}
}