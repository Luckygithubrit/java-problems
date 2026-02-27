import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        //first array
        int a=sc.nextInt();
        int arr1[]=new int[a];
        System.out.println("enter the numbers");
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        //second array
        System.out.println("enter the size:");
        int b=sc.nextInt();
        int arr2[]=new int[b];
        System.out.println("enter the numbers:");
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        int merge[]=new int[a+b];
        for(int i=0;i<a;i++){
            merge[i]=arr1[i];
            
        }
        for(int i=0;i<a;i++){
            merge[a+i]=arr2[i];
        }
        Arrays.sort(merge);
        
        System.out.println("merged array is:");
        System.out.println(Arrays.toString(merge));
        
        
        
        
    }
}