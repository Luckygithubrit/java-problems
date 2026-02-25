import java.util.*;
class Main {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=2;
        int b=0;
        while(a<=n){
            b=b+a;
            
            
            
            a=a+2;
        }
        System.out.println("the sum is:"+b);
    }
    
}