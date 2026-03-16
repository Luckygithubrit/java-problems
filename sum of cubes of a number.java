import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the Number:");
	    int a=sc.nextInt();
	   
        long sum=0;
        while(a>0){
            int temp=a%10;
            sum=sum+temp*temp*temp;
            a=a/10;
        }
	    System.out.println("sum of cubes of range:"+sum);
	    
	   
	   

	}
}