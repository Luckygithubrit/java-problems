import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    HashSet<Integer>lucky=new HashSet<>();
	    for(int num:arr){
	        lucky.add(num);
	    }
		System.out.println("result: "+lucky);
	}
}