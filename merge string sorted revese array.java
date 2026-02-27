import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        //first array
        int a=sc.nextInt();
        sc.nextLine();
        String arr1[]=new String[a];
        System.out.println("enter the Strings");
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextLine();
        }
        //second array
        System.out.println("enter the size:");
        int b=sc.nextInt();
        sc.nextLine();
        String arr2[]=new String[b];
        System.out.println("enter the Strings:");
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextLine();
        }
        String merge[]=new String[a+b];
        for(int i=0;i<a;i++){
            merge[i]=arr1[i];
            
        }
        for(int i=0;i<b;i++){
            merge[a+i]=arr2[i];
        }
        Arrays.sort(merge);
        System.out.println("merged array is:");
        System.out.println(Arrays.toString(merge));
        int start=0;
        int end=merge.length-1;
        while(start<end){
            String temp=merge[start];
            merge[start]=merge[end];
            merge[end]=temp;
            start++;
            end--;
        }
       
        
        System.out.println("merged  sorted reverse array is:");
        System.out.println(Arrays.toString(merge));
        
        
        
        
    }
}