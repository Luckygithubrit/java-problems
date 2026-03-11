import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int a=sc.nextInt();
        System.out.println("enter the numbers");
        int arr[]=new int[a];
        // int i;
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
    }
    // int i;
        int max=arr[0];
        int second=arr[0];
        int third=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                third=second;
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second && arr[i]!=max){
                third=second;
                second=arr[i];
                
            }
            else if(arr[i]>second && arr[i]!=max&&arr[i]!=second){
                third=arr[i];
            }
           
        }
         System.out.println("third max number is:"+third);
        }
    
    
}