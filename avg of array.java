import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        // sc.nextLine();
        int arr[]=new int[a];
        int sum=0;
        System.out.println("enter the numbbers :");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=(double) sum/a;
        System.out.println("avg is:"+avg);
        
        
    }
}