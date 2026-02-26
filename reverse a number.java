import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
            int temp=a%10;
            rev=rev*10+temp;
            a=a/10;
        }
        System.out.println("reverse number is: "+rev);
        
        
    }
}
