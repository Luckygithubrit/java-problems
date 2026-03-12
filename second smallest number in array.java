import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        
        int arr1[]=new int[a];
        System.out.println("enter the numbers:");
        
        // int second=arr1[0];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int small=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<small){
                second=small;
                small=arr1[i];
            
            }
            else if(arr1[i]<second&&arr1[i]!=small){
                second=arr1[i];
            }
            
        }
       
        
        
        
        
       
        System.out.println("second small number is:"+second);
        
        
        
        
        
        
    }
}