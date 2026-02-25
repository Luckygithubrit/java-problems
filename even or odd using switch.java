import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		switch(a%2){
		    case 0:
		        System.out.println("it is even");
		        break;
		    case 1:
		        System.out.println("is is odd");
		        break;
		    default:
		        System.out.println("negative");
		        break;
		        
		}
		sc.close();
	}
}