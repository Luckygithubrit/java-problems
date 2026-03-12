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
        System.out.println("duplicates are:");
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a-1;j++){
                if(arr1[i]==arr1[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
       
        
        
        
        
       
        
        
        
        
        
        
    }
}