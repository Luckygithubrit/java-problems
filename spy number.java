
// spy number is a number in which the sum of its digits is equal to the product of its digits. For example, 123 is a spy number because 1 + 2 + 3 = 6 and 1 * 2 * 3 = 6.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        int product=1;
        while(a>0){
            int r=a%10;
            sum=sum+r;
            product=product*r;
            a=a/10;
        }
        if(product==sum){
            System.out.println(temp+" is spy number");
        }
        else{
            System.out.println(temp+" is not spy a number");
        }
    }
}