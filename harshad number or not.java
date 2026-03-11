// must be divisible by the sum of its digits
// example: 18 is a harshad number because 1+8=9 and 18 is divisible by 9


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(a>0){
            int r=a%10;
            sum=sum+r;
            a=a/10;
        }
        if(temp%sum==0){
            System.out.println(temp+" is harshad number");
        }
        else{
            System.out.println(temp+" is not a harshad number");
        }
    }
}
