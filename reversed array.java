import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array size");
        int a=sc.nextInt();
        int arr[]=new int[a]; 
        int start=0;
        int end=a-1;
        System.out.println("enter the elements:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed array is:");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println("odd count:"+odd);
        
        
       
        
    }
}