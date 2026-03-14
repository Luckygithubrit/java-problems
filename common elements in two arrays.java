import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int a=sc.nextInt();
		System.out.println("enter the numbers");
		int arr1[]=new int[a];
		
		for(int i=0;i<arr1.length;i++){
		    arr1[i]=sc.nextInt();
		    
		}
		System.out.println("enter the size:");
		int b=sc.nextInt();
		System.out.println("enter the numbers");
		int arr2[]=new int[b];
		for(int i=0;i<arr1.length;i++){
		    arr2[i]=sc.nextInt();
		    
		}
		HashSet<Integer>lucky=new HashSet<>();
		for(int nums:arr1){
		    lucky.add(nums);
		}
		System.out.println("common elements are:");
		for(int nums:arr2){
		    if(lucky.contains(nums)){
		        System.out.print(nums+" ");
		    }
		}
		System.out.println();
	}
}