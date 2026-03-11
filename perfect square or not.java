import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum=sum+i;
            }
            
        }
        if(sum==a){
            System.out.println(a+" is a perfect square");
        }
        else{
            System.out.println(a+" is not a perfect square");
        }
    }
}