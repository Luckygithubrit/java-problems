
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        sc.nextLine();
        String arr1[]=new String[a];
        System.out.println("enter the numbers:");
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextLine();
        }
        System.out.println("duplicates are:");
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr1[i].equals(arr1[j])){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
       
        
        
        
        
       
        
        
        
        
        
        
    }
}