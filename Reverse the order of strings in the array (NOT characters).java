import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[a];
        int start=0;
        int end=arr.length-1;
        System.out.println("enter the String:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextLine();
        }
        while(start<end){
            String temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("the reversed array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
}