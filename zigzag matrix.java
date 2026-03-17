import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st matrix");
		int a=sc.nextInt();
		System.out.println("enter the 2nd matrix");
		int b=sc.nextInt();
		int matrix[][]=new int[a][b];
		System.out.println("enter the values");
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		System.out.println("the matrix is:");
		for(int i=0;i<a;i++){
		    if(i%2==0){
		        for(int j=0;j<b;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    
		        
		    }
		    else{
		        for(int j=b-1;j>=0;j--){
		        System.out.print(matrix[i][j]+" ");
		    }
		        
		    }
		    
		    System.out.println();
		}
    		
		
	}
}