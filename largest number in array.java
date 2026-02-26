import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enyter the elements:");
        int largest=arr[0];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest number is: "+largest);
      
        
        
    }
}