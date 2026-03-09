import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        // int sum=0;
        while(a>=10){
            int sum=0;
            while(a>0){
                sum=sum+a%10;
                a=a/10;
            }
            a=sum;
            
        }
        System.out.println("the digit root sum is:"+a);
        
    }
}