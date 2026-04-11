import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
            int temp=a%10;
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && temp > 7)) {
              System.out.println(0);
              return;
            }

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && temp < -8)) {
                System.out.println(0);
                return;
            }
            rev=rev*10+temp;
            a=a/10;
        }
        System.out.println("reverse number is: "+rev);
        
        
    }
}
