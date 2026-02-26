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
