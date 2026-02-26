import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int count=0;
        while(a!=0){
            int digit =a%10;
            count=count+digit;
            a=a/10;
        }
        System.out.println("sum is "+count);
        
        
    }
}