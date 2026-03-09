import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        // int sum=0;
        int rev=0;
        while(a>0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
           
        
        
            
        }
        int evensum=0;
        int oddsum=0;
        int pos=1;
        while(rev>0){
            int digit=rev%10;
            if(pos%2==0){
                evensum=evensum+digit;
            }
            else{
                oddsum=oddsum+digit;
            }
            rev=rev/10;
            pos++;
        }
            
        System.out.println("the even sum is:"+evensum);
        System.out.println("the odd sum is:"+oddsum);
        System.out.println("the difference is:"+(evensum-oddsum));
        
    }
}