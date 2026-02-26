import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int count=1;
        for(int i=1;i<=a;i++){
            count=count*i;
        }
        System.out.println("factorial of "+a+" is "+count);
        
        
    }
}