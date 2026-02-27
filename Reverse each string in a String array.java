import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[a];
        System.out.println("enter the String:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            String b=arr[i];
            String rev="";
            for(int j=b.length()-1;j>=0;j--){
                rev=rev+b.charAt(j);
                
            }
            arr[i]=rev;
            
        }
        System.out.println("the reversed array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
}