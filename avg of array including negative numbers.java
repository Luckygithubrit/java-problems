import java.util.*;
class Solution {
      public static void main(String[] args)   {
        // Code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        int count=0;
        int a=arr.length;
        for(int i=0;i<a;i++){
            if(arr[i]>=0){
                
            
                sum=arr[i]+sum;
                count++;
            }
        }
        if(count==0){
            System.out.println("no positive numbers in the array");
            return;
        }
        
        
        System.out.println((double)sum/count);
        // return c;
    }
}
