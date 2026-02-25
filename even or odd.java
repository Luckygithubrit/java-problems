import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enyter a number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
        sc.close();
    }
}