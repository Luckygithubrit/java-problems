import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base number");
        int a=sc.nextInt();
        System.out.println("enter the power value");
        int b=sc.nextInt();
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
        }
        System.out.println("power is"+power);
        
    }
}