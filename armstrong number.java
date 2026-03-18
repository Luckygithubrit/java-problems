
// armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an armstrong number because 1^3 + 5^3 + 3^3 = 153.
import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int same=a;
        int count=0;
        while(a!=0){
            int digit =a%10;
            count=count+(digit*digit*digit);
            a=a/10;
        }
        if(count==same)
        System.out.println("is is armstrong number");
        else
        System.out.println("is is not a armstrong number");
        
        
    }
}
