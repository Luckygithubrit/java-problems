import java.util.*;

class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int sum=0;
       for(int i=0;i<=a;i=i+1){
           if(i%2==0){
               sum=sum+i;
           }
           
           
          
       }
       System.out.println(sum);
    }
}