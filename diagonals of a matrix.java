// question: Write a program to find the diagonals of a matrix.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size rows");
	    int a=sc.nextInt();
	    System.out.println("enter the size of columns");
	    int b=sc.nextInt();
	    int mat[][]=new int[a][b];
	    System.out.println("enter the numbers:");
	    for(int i=0;i<a;i++){
	        for(int j=0;j<b;j++){
	            mat[i][j]=sc.nextInt();
	            
	        }
	    }
	    System.out.println("the matrix is:");
	    for(int i=0;i<a;i++){
	        for(int j=0;j<b;j++){
	            System.out.print(mat[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.print("the diagonals are:");
	    for(int i=0;i<a;i++){
	        
	       System.out.print(mat[i][i]+" ");
	        
	        
	    }
		System.out.println();
		System.out.print("the oposite diagonals are:");
	    for(int i=0;i<a;i++){
	        
	       System.out.print(mat[i][a-i-1]+" ");
	        
	        
	    }
		System.out.println();
	}
}