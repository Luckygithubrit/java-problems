import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value");
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    System.out.println("enter yhe numbers");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	    int n=arr.length+1;
	    int total=n*(n+1)/2;
	    for(int num:arr){
	        total=total-num;
	    }
	    System.out.println("missing element is : "+total);
	    
	    
	    
	    
		
	}
}