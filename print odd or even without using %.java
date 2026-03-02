import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the number");
        if((a & 1)==0){
            System.out.println(a+" is even");
        }
        else{
            System.out.println(a+"  is odd");
        }
        // System.out.println("Try programiz.pro");
    }
}