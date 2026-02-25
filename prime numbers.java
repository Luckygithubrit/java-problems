import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        
        int n=sc.nextInt();
        int a=2;
        while(a<=n){
            int count=0;
            int i=1;
            while(i<=a){
                if(a%i==0){
                    count++;
                }
                i++;
            }
            if(count==2){
                System.out.println(a);
            }
            a++;
            
        }
        
        
        // System.out.println("Try programiz.pro");
    }
}