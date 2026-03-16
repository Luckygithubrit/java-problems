import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("ente the rows");
	    int a=sc.nextInt();
	    System.out.println("ente the columns");
	    int b=sc.nextInt();
	    
	    int matrix[][]=new int[a][b];
	    System.out.println("enter the numbers");
	    for(int i=0;i<a;i++){
	        for(int j=0;j<b;j++){
	            matrix[i][j]=sc.nextInt();
	        }
	        
	    }
	    System.out.println("matrix is:");
	    for(int i=0;i<a;i++){
	        for(int j=0;j<b;j++){
	            System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    
	   
	   

	}
}