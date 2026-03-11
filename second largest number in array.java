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
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second && arr[i]!=max){
                second=arr[i];
            }
           
        }
         System.out.println("second max number is:"+second);
        }
    
    
}