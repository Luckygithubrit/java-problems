import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size:");
	    int a=sc.nextInt();
	    System.out.println("enter the target:");
	    int target=sc.nextInt();
	    boolean found=true;
	    int arr[]=new int[a];
	    System.out.println("enter the numbers:");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	        
	    }
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]+arr[j]==target){
	                System.out.println("the indexes are: "+i+" "+j);
	                found=true;
	            }
	        }
	    }
	    if(!found){
	        System.out.println("not found");
	    }

	}
}